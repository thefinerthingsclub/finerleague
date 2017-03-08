import { NgModule, Optional, SkipSelf } from '@angular/core';

import { CommonModule } from '@angular/common';
import { FormsModule }    from '@angular/forms';
import { throwIfAlreadyLoaded } from './module-import-guard';

import { NavComponent } from './nav/nav.component';
import { SpinnerComponent } from './spinner/spinner.component';
import { SpinnerService } from './spinner/spinner.service';

import { LoggerService } from './logger.service';
import { ExceptionService } from './exception.service';
import { UserProfileService } from './user-profile.service';

@NgModule({
  imports: [
    CommonModule, // we use ngFor
    FormsModule
  ],
  exports: [NavComponent, SpinnerComponent],
  declarations: [NavComponent, SpinnerComponent],
  providers: [LoggerService, ExceptionService, SpinnerService, UserProfileService]
})
export class CoreModule { 
  constructor( @Optional() @SkipSelf() parentModule: CoreModule) {
    throwIfAlreadyLoaded(parentModule, 'CoreModule');
  }
}