import { NO_ERRORS_SCHEMA, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { TestBed, async } from '@angular/core/testing';

import { Subscription } from 'rxjs/Subscription';

import { CommonModule } from '@angular/common';
import { RouterTestingModule } from '@angular/router/testing';
import { Routes, Router, RouterModule, ActivatedRoute } from '@angular/router';

import { Component } from '@angular/core';
import { AppComponent } from './app.component';
import { HeaderComponent } from './core/header/header.component';
import { FooterComponent } from './core/footer/footer.component';
import { NavComponent } from './core/nav/nav.component';
import { SpinnerComponent } from './core/spinner/spinner.component';
import { LoginComponent } from './shared/login/login.component';
import { LoggerService } from './core/logger.service';
import { ExceptionService } from './core/exception.service';
import { SpinnerService } from './core/spinner/spinner.service';

const appTitle = 'Hello Finerleague';
export const fake_routes: Routes = [{path: 'login', component: LoginComponent}];

describe('AppComponent', () => {
  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [
        AppComponent,
        HeaderComponent,
        FooterComponent,
        NavComponent,
        SpinnerComponent,
        LoginComponent
      ],
      schemas: [ NO_ERRORS_SCHEMA ],
      providers: [LoggerService, ExceptionService, SpinnerService],
      imports: [
        CommonModule,
        RouterTestingModule.withRoutes(fake_routes)
      ]
    }).compileComponents();
  }));

  it('should create the app', async(() => {
    const fixture = TestBed.createComponent(AppComponent);
    fixture.detectChanges();
    const app = fixture.debugElement.componentInstance;
    expect(app).toBeTruthy();
  }));

  it('should render title "'+appTitle+'" in a h1 tag', async(() => {
    const fixture = TestBed.createComponent(AppComponent);
    fixture.detectChanges();
    const compiled = fixture.debugElement.nativeElement;
    expect(compiled.querySelector('h1').textContent).toContain(appTitle);
  }));
});
