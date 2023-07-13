import { Component } from '@angular/core';
import { Personne } from '../models/personne';
import { PersonneService } from '../services/personne.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-personne',
  templateUrl: './personne.component.html',
  styleUrls: ['./personne.component.css']
})
export class PersonneComponent {
  personnes ?: Personne[]

  constructor(private service: PersonneService,
    private router: Router) { }

  ngOnInit(): void {
    this.getPersonnes();
  }

  private getPersonnes(){
    this.service.getPersonnes().subscribe(data => {
      this.personnes = data;
    });
  }


  personneDetails(idPers: number){
    this.router.navigate(['personne-details', idPers]);
  }

  updatePersonne(idPers: number){
    this.router.navigate(['update-personne', idPers]);
  }

  deletePersonne(idPers: number){
    this.service.deletePersonne(idPers).subscribe( data => {
      console.log(data);
      this.getPersonnes();
    })
}
}
