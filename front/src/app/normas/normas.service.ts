import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { TokenService } from '../core/token/token.service';

const baseUrl = 'http://localhost:8089/normas';

@Injectable({
  providedIn: 'root'
})
export class NormasService {

  constructor(private http: HttpClient, private tokenService: TokenService) { }

  getAll(): Observable<any> {
    const headers = { 'Authorization': this.tokenService.getToken() };
    return this.http.get(baseUrl,{headers});
  }
}
