import { Component } from '@angular/core';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent {
  actions: Array<any> = [
    {title : 'Accueil', 'route':"/home", icon: "house-fill"},
    {title : 'Personnes', 'route':"/personnes", icon: "people"},
    {title : 'Immeubles', 'route':"/immeubles", icon: "buildings-fill"},
    {title : 'Contrat', 'route':"/contrats", icon: "credit-card-fill"},
  ];

  currentAction: any;

  setCurrentAction(action: any) {
    this.currentAction = action;
  }
}
