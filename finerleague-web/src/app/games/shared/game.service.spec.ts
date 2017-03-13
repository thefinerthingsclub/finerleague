import { TestBed, inject } from '@angular/core/testing';
import { HttpModule, Http, BaseRequestOptions, XHRBackend } from '@angular/http';
import { GameService } from './game.service';

describe('GamesService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      imports: [HttpModule],
      providers: [GameService]
    });
  });

  it('should ...', inject([GameService], (service: GameService) => {
    expect(service).toBeTruthy();
  }));
});
