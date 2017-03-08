import { NgModule } from '@angular/core';

import { BrowserModule } from '@angular/platform-browser';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';

import { LoginComponent } from './login/login.component';
import { PageNotFoundComponent } from './not-found/not-found.component';

@NgModule({
  imports: [
    BrowserModule,
    CommonModule,
    FormsModule,
    HttpModule
  ],
  declarations: [LoginComponent, PageNotFoundComponent],
  providers: [],
  exports: [
    BrowserModule,
    CommonModule,
    FormsModule,
    HttpModule,
    LoginComponent,
    PageNotFoundComponent
  ]
})
export class SharedModule { }
