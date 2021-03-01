import { TestBed, inject } from '@angular/core/testing';

import { ProcessosService } from './processos.service';

describe('ProcessosService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [ProcessosService]
    });
  });

  it('should be created', inject([ProcessosService], (service: ProcessosService) => {
    expect(service).toBeTruthy();
  }));
});
