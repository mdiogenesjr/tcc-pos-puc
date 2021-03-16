import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { TokenService } from '../core/token/token.service';
import { GlobalVariable } from '../global';

const baseUrl = GlobalVariable.BASE_API_URL+'/normas';

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
