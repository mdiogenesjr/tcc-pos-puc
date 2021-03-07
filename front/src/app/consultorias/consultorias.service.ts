import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

const baseUrl = 'http://tcc-pos-alb-1565863230.us-east-1.elb.amazonaws.com:8089/consultorias';

@Injectable({
  providedIn: 'root'
})
export class ConsultoriasService {

  constructor(private http: HttpClient) { }

  getAll(): Observable<any> {
    return this.http.get(baseUrl);
  }
}
