import { Injectable } from '@angular/core';
import { Http, Response, Headers, RequestOptions } from '@angular/http';
import {Observable} from 'rxjs/Rx';

// Import RxJs required methods
import 'rxjs/add/operator/map';
import 'rxjs/add/operator/catch';

import { Game } from './game';

@Injectable()
export class GameService {

  constructor(private http: Http) { }

    findById(id: string): Observable<Game>{
        return this.http.get("/api/game/" + id)
                         .map((res:Response) => res.json())
                         .catch((error:any) => Observable.throw(error.json().error || 'Error fetching game with id ' + id));
    }
    findAll(): Observable<Game[]>{
        return this.http.get("/api/game")
                         .map((res:Response) => res.json())
                         .catch((error:any) => Observable.throw(error.json().error || 'Error fetching all games'));

     }
}
