import { NgModule, Optional, SkipSelf } from '@angular/core';

import { SharedModule }     from '../shared/shared.module';
import { throwIfAlreadyLoaded } from './module-import-guard';

import { HeaderComponent } from './header/header.component';
import { FooterComponent } from './footer/footer.component';
import { NavComponent } from './nav/nav.component';
import { SpinnerComponent } from './spinner/spinner.component';
import { SpinnerService } from './spinner/spinner.service';

import { BaseService } from './base.service';
import { LoggerService } from './logger.service';
import { ExceptionService } from './exception.service';
import { UserProfileService } from './user-profile.service';
import {AuthenticationService} from "./authentication.service";
import {AuthGuard} from "./auth.guard";

// used to create fake backend
import {fakeBackendProvider} from "../shared/fake-backend";
import {BaseRequestOptions} from "@angular/http";
import {MockBackend} from "@angular/http/testing";



@NgModule({
  imports: [
    SharedModule
  ],
  exports: [HeaderComponent, FooterComponent, NavComponent, SpinnerComponent],
  declarations: [HeaderComponent, FooterComponent, NavComponent, SpinnerComponent],
  providers: [
    BaseService,
    LoggerService,
    ExceptionService,
    SpinnerService,
    UserProfileService,
    AuthenticationService,
    AuthGuard,

    // providers used to create fake backend
    fakeBackendProvider,
    MockBackend,
    BaseRequestOptions
  ]
})
export class CoreModule {
  constructor( @Optional() @SkipSelf() parentModule: CoreModule) {
    throwIfAlreadyLoaded(parentModule, 'CoreModule');
  }
}
