import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

const urlProcesso = 'http://tcc-pos-alb-1565863230.us-east-1.elb.amazonaws.com:8089/processo';
const urlProcessoAgendamento = 'http://tcc-pos-alb-1565863230.us-east-1.elb.amazonaws.com:8089/processo/agendar-etapa-processo';

@Injectable({
  providedIn: 'root'
})
export class ProcessosService {

  constructor(private http: HttpClient) { }

  getAll(): Observable<any> {
    return this.http.get(urlProcesso);
  }

  agendarEtapaProcesso(data): Observable<any> {
    return this.http.post(urlProcessoAgendamento,data);
  }

  
}
