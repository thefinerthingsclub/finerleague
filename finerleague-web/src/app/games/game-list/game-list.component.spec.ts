import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { RouterTestingModule } from '@angular/router/testing';
import { Routes, ActivatedRoute, Router } from '@angular/router';

import { GameListComponent } from './game-list.component';
import { GameService } from '../shared/game.service';
import { SpinnerService } from '../../core/spinner/spinner.service';

export const fake_routes: Routes = [{path: 'games', component: GameListComponent}];

describe('GameListComponent', () => {
  let component: GameListComponent;
  let fixture: ComponentFixture<GameListComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ GameListComponent ],
      providers: [ GameService, SpinnerService ],
      imports: [ RouterTestingModule.withRoutes(fake_routes) ]
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
