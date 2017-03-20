import { TestBed, inject } from '@angular/core/testing';

import { HttpModule, Http } from '@angular/http';

import { BaseService } from './base.service';

describe('BaseService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [BaseService],
      imports: [HttpModule]
    });
  });

  it('should ...', inject([BaseService], (service: BaseService) => {
    expect(service).toBeTruthy();
  }));
});
