import {Component, OnInit} from '@angular/core';
import {catchError, map, Observable, throwError} from "rxjs";
import {Personne} from "../model/personne";
import {FormBuilder, FormGroup} from "@angular/forms";
import {PersonneService} from "../services/personne.service";
import {Router} from "@angular/router";

@Component({
  selector: 'app-personne',
  templateUrl: './personne.component.html',
  styleUrls: ['./personne.component.css']
})
export class PersonneComponent implements OnInit{
  personnes! : Observable<Array<Personne>>;
  errorMessage!: string;
  searchFormGroup : FormGroup | undefined;
  constructor(private personneService : PersonneService, private fb : FormBuilder, private router : Router) { }

  ngOnInit(): void {
    this.searchFormGroup=this.fb.group({
      keyword : this.fb.control("")
    });
    this.handleSearchCustomers();
  }
  handleSearchCustomers() {
    let kw=this.searchFormGroup?.value.keyword;
    this.personnes = this.personneService.searchPersons(kw).pipe(
      catchError(err => {
        this.errorMessage=err.message;
        return throwError(err);
      })
    );
  }

  handleDeletePerson(p: Personne) {
    let conf = confirm("Are you sure?");
    if(!conf) return;
    this.personneService.deletePerson(p.idpers).subscribe({
      next : (resp) => {
        this.personnes = this.personnes.pipe(
          map(data => {
            let index=data.indexOf(p);
            data.slice(index,1)
            return data;
          })
        );
      },
      error : err => {
        console.log(err);
      }
    })
  }
}
