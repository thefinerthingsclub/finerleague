import { Component, OnInit } from '@angular/core';

import { LoggerService } from '../../core/logger.service';

@Component({
  moduleId: module.id,
  selector: 'fl-page-not-found',
  templateUrl: './not-found.component.html',
  styleUrls: ['./not-found.component.css']
})
export class PageNotFoundComponent implements OnInit {

  constructor(private loggerService: LoggerService) { }

  ngOnInit() {
    this.loggerService.log('... initializing page not found component from shared module.');
  }

}
