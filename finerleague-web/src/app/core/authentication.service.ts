import {Injectable} from "@angular/core";
import {Http} from "@angular/http";
import {LoggerService} from "./logger.service";

export interface IAuth{
  email: string,
  password: string
}

@Injectable()
export class AuthenticationService {

  constructor(
    private http: Http,
    private loggerService: LoggerService
  ){}


  login(auth: IAuth){
      //TODO login method
      this.loggerService.log(`Se ha llamado al login con ${auth.email} y ${auth.password}`);
  }


  logout(){
      this.loggerService.log(`Se ha llamado al logout`);
      //TODO logout method
      //localStorage.removeItem('currentUser');
  }
}
