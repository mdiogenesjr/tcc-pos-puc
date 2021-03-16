import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { TokenService } from '../core/token/token.service';
import { GlobalVariable } from '../global';

const urlProcesso = GlobalVariable.BASE_API_URL+'/processo';
const urlProcessoAgendamento = GlobalVariable.BASE_API_URL+'/processo/agendar-etapa-processo';

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
