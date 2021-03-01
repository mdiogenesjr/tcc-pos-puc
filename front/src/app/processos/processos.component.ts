import { Component, OnInit } from '@angular/core';
import { ProcessosService } from './processos.service';

@Component({
  selector: 'app-processos',
  templateUrl: './processos.component.html',
  styleUrls: ['./processos.component.css']
})
export class ProcessosComponent implements OnInit {

  etapas: any;
  currentProcesso = null;
  currentIndex = -1;
  title = '';
  agendamentoMensagem: string;

  constructor(private processosService: ProcessosService) { }

  ngOnInit(): void {
    this.retrieveConsultorias();
  }

  retrieveConsultorias(): void {
    this.processosService.getAll()
      .subscribe(
        data => {
          this.etapas = data;
          console.log(data);
        },
        error => {
          console.log(error);
        });
  }

  setActiveEtapa(etapa, index): void {
    this.currentProcesso = etapa;
    this.currentIndex = index;
  }
  agendarProcesso(){
    const dataParam = {
      idProcesso: 1,
      idEtapa: 1
    };
    this.processosService.agendarEtapaProcesso(dataParam).subscribe(
      data => {
        this.agendamentoMensagem = data;
        console.log(data);
      },
      error => {
        console.log(error);
      });
  }

}
