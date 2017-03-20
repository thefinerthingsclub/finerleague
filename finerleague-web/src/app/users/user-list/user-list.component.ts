import { Component, OnInit } from '@angular/core';

import { LoggerService } from '../../core/logger.service';

@Component({
  moduleId: module.id,
  selector: 'user-list',
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
