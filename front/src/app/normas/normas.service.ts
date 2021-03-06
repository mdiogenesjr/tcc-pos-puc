import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

const baseUrl = 'http://ec2-54-163-28-147.compute-1.amazonaws.com:8089/normas';

@Injectable({
  providedIn: 'root'
})
export class NormasService {

  constructor(private http: HttpClient) { }

  getAll(): Observable<any> {
    return this.http.get(baseUrl);
  }
}
