import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  actions: Array<any> = [
    {title : 'Personnes', 'route':"/personnes", icon: "house"}
  ];

  currentAction: any;

  setCurrentAction(action: any) {
    this.currentAction = action;
  }

}
