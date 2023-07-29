import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Personne} from "../model/personne";
import {environment} from "../environment/environment";

@Injectable({
  providedIn: 'root'
})
export class PersonneService {
  constructor(private http:HttpClient) { }

  public getPersonnes():Observable<Array<Personne>>{
    return this.http.get<Array<Personne>>(environment.backendHost+"/personnes")
  }
  public searchPersons(keyword : string):Observable<Array<Personne>>{
    return this.http.get<Array<Personne>>(environment.backendHost+"/customers/search?keyword="+keyword)
  }
  public savePerson(person: Personne):Observable<Personne>{
    return this.http.post<Personne>(environment.backendHost+"/personnes",person);
  }
  public deletePerson(id: number){
    return this.http.delete(environment.backendHost+"/personnes/delete/"+id);
  }
}
