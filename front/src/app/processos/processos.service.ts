import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { TokenService } from '../core/token/token.service';

const urlProcesso = 'http://tcc-pos-alb-1565863230.us-east-1.elb.amazonaws.com:8089/processo';
const urlProcessoAgendamento = 'http://tcc-pos-alb-1565863230.us-east-1.elb.amazonaws.com:8089/processo/agendar-etapa-processo';

@Injectable({
  providedIn: 'root'
})
export class ProcessosService {

  constructor(private http: HttpClient, private tokenService: TokenService) { }

  getAll(): Observable<any> {
    const headers = { 'Authorization': this.tokenService.getToken() };
    return this.http.get(urlProcesso,{ headers });
  }

  agendarEtapaProcesso(data): Observable<any> {
    const headers = { 'Authorization': this.tokenService.getToken() };
    return this.http.post(urlProcessoAgendamento,data,{ headers });
  } 

  
}
