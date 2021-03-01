import { TestBed, inject } from '@angular/core/testing';

import { ConsultoriasService } from './consultorias.service';

describe('ConsultoriasService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [ConsultoriasService]
    });
  });

  it('should be created', inject([ConsultoriasService], (service: ConsultoriasService) => {
    expect(service).toBeTruthy();
  }));
});
