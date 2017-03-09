import { TestBed, inject } from '@angular/core/testing';

import { GameService } from './game.service';

describe('GamesService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [GameService]
    });
  });

  it('should ...', inject([GameService], (service: GameService) => {
    expect(service).toBeTruthy();
  }));
});
