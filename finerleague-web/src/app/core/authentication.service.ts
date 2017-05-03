import {Injectable} from "@angular/core";
import {Http, Response} from "@angular/http";
import {LoggerService} from "./logger.service";
import { Observable } from 'rxjs/Observable';
import 'rxjs/add/operator/map'

export interface IAuth{
  username: string,
  password: string
}

@Injectable()
export class AuthenticationService {

  private authenticated:boolean = false;

  constructor(
    private http: Http,
    private loggerService: LoggerService
  ){}


  login(auth: IAuth){
      this.loggerService.log(`Se ha llamado al login con ${auth.username} y ${auth.password}`);
      return this.http.post('/api/authenticate', JSON.stringify({ username: auth.username, password: auth.password }))
        .map((response: Response) => {
          // login successful if there's a jwt token in the response
          let user = response.json();
          if (user && user.token) {
            // store user details and jwt token in local storage to keep user logged in between page refreshes
            localStorage.setItem('currentUser', JSON.stringify(user));
            this.authenticated = true;
          }
      });

  }


  logout(){
      this.loggerService.log(`Se ha llamado al logout`);
      //TODO logout method
      localStorage.removeItem('currentUser');
      this.authenticated = false;
  }
}

export class User {
  id: number;
  username: string;
  password: string;
  firstName: string;
  lastName: string;
}
