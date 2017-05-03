import { Component, OnInit } from '@angular/core';

import { LoggerService } from '../logger.service';
import {AuthenticationService} from "../authentication.service";
import {Router} from "@angular/router";

@Component({
  selector: 'ftc-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {

  constructor(
    private loggerService: LoggerService,
    private authenticationService:AuthenticationService,
    private router: Router, //TODO: Remove and subscribe method to logout
  ) { }

  ngOnInit() {
    this.loggerService.log('... initializing header component from core module.');
  }

  onClickLogOut(event: Event): void {
    event.preventDefault(); // Prevents browser following the link
    this.authenticationService.logout();
    this.router.navigate(['']);
  }

}
