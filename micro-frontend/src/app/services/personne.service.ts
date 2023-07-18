import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'
import { Observable } from 'rxjs';
import {Personne} from "../../../model/personne.model";

@Injectable({
  providedIn: 'root'
})
export class PersonneService {
  private baseURL = "http://localhost:8086/api/v1/personnes";
  constructor(private httpClient:HttpClient) { }

  getPersonnes(): Observable<Personne[]>{
    return this.httpClient.get<Array<Personne>>(`${this.baseURL}`);
  }

  createPesonne(personne: Personne): Observable<Object>{
    return this.httpClient.post(`${this.baseURL}`, personne);
  }

  getPersonneById(idPers: number): Observable<Personne>{
    return this.httpClient.get<Personne>(`${this.baseURL}/${idPers}`);
  }

  updatePersonne(idPers: number, personne: Personne): Observable<Object>{
    return this.httpClient.put(`${this.baseURL}/${idPers}`, personne);
  }

  deletePersonne(idPers: number): Observable<Object>{
    return this.httpClient.delete(`${this.baseURL}/delete/${idPers}`);
  }
}
