import { Injectable } from '@angular/core';
import { Http, Response, Headers, RequestOptions } from '@angular/http';
import {Observable} from 'rxjs/Rx';

import { BaseService } from '../../core/base.service';

// Import RxJs required methods
import 'rxjs/add/operator/map';
import 'rxjs/add/operator/catch';

import { Game } from './game';

@Injectable()
export class GameService extends BaseService{
  protected urlService = this.rootContext + "/api/game";

  constructor(protected http: Http) { super(http); }

    findById(id: string): Observable<Game>{
        return this.http.get(this.urlService + "/" + id)
                         .map(this.extractData)
                         .catch(this.handleError);
    }

    findAll(): Observable<Game[]>{
        return this.http.get(this.urlService)
                         .map(this.extractData)
                         .catch(this.handleError);

    }

    save(game: Game): Observable<Response> {
      if (game.id) {
        return this.http.put(this.urlService + '/' + game.id, game.json(), this.getOptions()).catch(this.handleError);
      } else {
        return this.http.post(this.urlService, game.json(), this.getOptions()).catch(this.handleError);
      }
    }

    delete(id: string): Observable<Response> {
      return this.http.delete(this.urlService + '/' + id).catch(this.handleError);
    }
}
