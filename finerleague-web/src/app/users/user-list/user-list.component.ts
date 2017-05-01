import { Component, OnInit } from '@angular/core';

import { LoggerService } from '../../core/logger.service';

@Component({
  selector: 'ftc-user-list',
  templateUrl: './user-list.component.html',
  styleUrls: ['./user-list.component.css']
})

export class UserListComponent implements OnInit {
  constructor(
    private loggerService: LoggerService
  ) {}

  ngOnInit() {
      this.loggerService.log('... initializing user list component.');
  }
}
