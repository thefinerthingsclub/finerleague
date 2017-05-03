import { Component, OnInit } from '@angular/core';

import { LoggerService } from '../../core/logger.service';
import {AuthenticationService, IAuth} from '../../core/authentication.service';
import {Router, ActivatedRoute} from "@angular/router";
import {FormGroup, FormControl, FormBuilder, Validators} from "@angular/forms";


@Component({
  selector: 'ftc-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  loginForm: FormGroup;
  returnUrl: string;

  constructor(
    private route: ActivatedRoute,
    private router: Router,
    private authenticationService: AuthenticationService,
    private fb: FormBuilder,
    private loggerService: LoggerService
  ) { }


  ngOnInit() {
    // reset login status
    this.authenticationService.logout();

    // get return url from route parameters or default to '/'
    this.returnUrl = this.route.snapshot.queryParams['returnUrl'] || '/';

    this.loggerService.log('... initializing login component from shared module.');
    this.loginForm = this.fb.group({
      username: ['', Validators.required],
      password: ['', Validators.required]
    });
    //TODO: check auth control
    //this.loggerService.log("Auto login")
    //this.router.navigate(['/games']);
  }


  public onSubmit({value, valid}: {value: IAuth, valid: boolean}):void {
    if (valid){
      this.authenticationService.login(value).subscribe(
        data => {
          console.log(`submit OK`);
          console.log("return " + this.returnUrl);
          this.router.navigate([this.returnUrl]);
        },
        error => {
          console.log('submit error');
        }
      );
    }
  }

}
