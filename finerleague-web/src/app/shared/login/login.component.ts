import { Component, OnInit } from '@angular/core';

import { LoggerService } from '../../core/logger.service';
import {AuthenticationService, IAuth} from '../../core/authentication.service';
import {Router, ActivatedRoute} from "@angular/router";
import {FormGroup, FormControl, FormBuilder, Validators} from "@angular/forms";


@Component({
  moduleId: module.id,
  selector: 'fl-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  loginForm: FormGroup;

  constructor(
    private route: ActivatedRoute,
    private router: Router,
    private authenticationService: AuthenticationService,
    private fb: FormBuilder,
    private loggerService: LoggerService
  ) { }


  ngOnInit() {
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
          console.log(`retorno OK`);
        },
        error => {
          console.log('retorno erroneo');
        }
      );
    }
  }

}
