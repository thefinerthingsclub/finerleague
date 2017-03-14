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

@NgModule({
  imports: [
    SharedModule
  ],
  exports: [HeaderComponent, FooterComponent, NavComponent, SpinnerComponent],
  declarations: [HeaderComponent, FooterComponent, NavComponent, SpinnerComponent],
  providers: [BaseService, LoggerService, ExceptionService, SpinnerService, UserProfileService]
})
export class CoreModule {
  constructor( @Optional() @SkipSelf() parentModule: CoreModule) {
    throwIfAlreadyLoaded(parentModule, 'CoreModule');
  }
}
