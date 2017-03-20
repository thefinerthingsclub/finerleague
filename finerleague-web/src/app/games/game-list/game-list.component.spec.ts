import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { NO_ERRORS_SCHEMA } from '@angular/core';
import { HttpModule } from '@angular/http';
import { RouterTestingModule } from '@angular/router/testing';
import { Routes, ActivatedRoute, Router } from '@angular/router';

import { GameListComponent } from './game-list.component';
import { GameService } from '../shared/game.service';
import { SpinnerService } from '../../core/spinner/spinner.service';
import { LoggerService } from '../../core/logger.service';

export const fake_routes: Routes = [{path: 'games', component: GameListComponent}];

describe('GameListComponent', () => {
  let component: GameListComponent;
  let fixture: ComponentFixture<GameListComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ GameListComponent ],
      providers: [ GameService, SpinnerService, LoggerService ],
      imports: [ RouterTestingModule.withRoutes(fake_routes), HttpModule ],
      schemas: [ NO_ERRORS_SCHEMA ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(GameListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
