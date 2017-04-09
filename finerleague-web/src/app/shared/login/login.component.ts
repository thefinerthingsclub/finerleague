import { Component, OnInit } from '@angular/core';

import { LoggerService } from '../../core/logger.service';
import { Router } from '@angular/router';

@Component({
  moduleId: module.id,
  selector: 'fl-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  constructor(
    private router: Router,
    private loggerService: LoggerService
  ) { }

  ngOnInit() {
    this.loggerService.log('... initializing login component from shared module.');
    // TODO: check auth control
    this.loggerService.log('Auto login');
    this.router.navigate(['/games']);
  }

}
