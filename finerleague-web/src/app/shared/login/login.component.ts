import { Component, OnInit } from '@angular/core';

import { LoggerService } from '../../core/logger.service';

@Component({
  moduleId: module.id,
  selector: 'fl-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  constructor(private loggerService: LoggerService) { }

  ngOnInit() {
    this.loggerService.log('... initializing login component from shared module.');
  }

}
