import { Injectable } from '@angular/core';
import { Http, Response, Headers, RequestOptions } from '@angular/http';
import {Observable} from 'rxjs/Rx';

@Injectable()
export class BaseService {
  protected rootContext: string = '';

  constructor(protected http: Http) {
    // this.rootContext = location.pathname.split('/').filter(n => n)[0] || '';
    // if (this.rootContext.length > 0) {
    //   this.rootContext = '/' + this.rootContext;
    // }
  }

  protected getOptions(): RequestOptions {
      let headers: Headers = new Headers();
      headers.append('content-type', 'application/json; charset=utf-8');
      let opts = new RequestOptions({headers: headers});
      opts.headers = headers;
      return opts;
  }

  protected extractData(res: Response) {
    return res.json() || { };
  }

  protected handleError (error: Response | any) {
    // In a real world app, you might use a remote logging infrastructure
    let errMsg: string;
    if (error instanceof Response) {
      const body = error.json() || '';
      const err = body.error || JSON.stringify(body);
      errMsg = `${error.status} - ${error.statusText || ''} ${err}`;
    } else {
      errMsg = error.message ? error.message : error.toString();
    }
    console.error(errMsg);
    return Observable.throw(errMsg);
  }
}
