import { TestBed, inject } from '@angular/core/testing';

import { NormasService } from './normas.service';

describe('NormasService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [NormasService]
    });
  });

  it('should be created', inject([NormasService], (service: NormasService) => {
    expect(service).toBeTruthy();
  }));
});
