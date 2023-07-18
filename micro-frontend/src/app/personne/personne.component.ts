import {Component, OnInit} from '@angular/core';
import { PersonneService } from '../services/personne.service';
import { Router } from '@angular/router';
import {Personne} from "../../../model/personne.model";

@Component({
  selector: 'app-personne',
  templateUrl: './personne.component.html',
  styleUrls: ['./personne.component.css']
})
export class PersonneComponent implements OnInit{
  public personnes: Array<Personne> = [];

  constructor(private service: PersonneService) { }

  ngOnInit(): void {
    this.getPersonnes();
  }

  private getPersonnes(){
    this.service.getPersonnes()
      .subscribe({
        next : data => {
          this.personnes = data
        },
        error : err => {console.log(err)}
      });
  }

  handleUpdatePersonne(personne: Personne) {

  }

  handleDeletePersonne(personne: Personne) {

  }
}
