import { Component, OnInit } from '@angular/core';
import { ConsultoriasService } from './consultorias.service';

@Component({
  selector: 'app-consultorias',
  templateUrl: './consultorias.component.html',
  styleUrls: ['./consultorias.component.css']
})
export class ConsultoriasComponent implements OnInit {

  consultorias: any;
  currentConsultorias = null;
  currentIndex = -1;
  title = '';

  constructor(private consultoriaService: ConsultoriasService) { }

  ngOnInit(): void {
    this.retrieveConsultorias();
  }

  retrieveConsultorias(): void {
    this.consultoriaService.getAll()
      .subscribe(
        data => {
          this.consultorias = data;
          console.log(data);
        },
        error => {
          console.log(error);
        });
  }

  refreshList(): void {
    this.retrieveConsultorias();
    this.currentConsultorias = null;
    this.currentIndex = -1;
  }

  setActiveConsultoria(consultoria, index): void {
    this.currentConsultorias = consultoria;
    this.currentIndex = index;
  }

}
