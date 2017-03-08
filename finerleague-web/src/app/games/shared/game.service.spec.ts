import { TestBed, inject } from '@angular/core/testing';

import { GamesService } from './games.service';

describe('GamesService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [GamesService]
    });
  });

  it('should ...', inject([GamesService], (service: GamesService) => {
    expect(service).toBeTruthy();
  }));
});
