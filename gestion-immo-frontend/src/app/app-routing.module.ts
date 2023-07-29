import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {LoginComponent} from "./login/login.component";
import {AdminTemplateComponent} from "./admin-template/admin-template.component";
import {PersonneComponent} from "./personne/personne.component";
import {NewPersonneComponent} from "./new-personne/new-personne.component";

const routes: Routes = [
  {path: "login", component: LoginComponent},
  {path: "", redirectTo: "/login", pathMatch: "full"},
  {path: "admin", component: AdminTemplateComponent,
    children: [
      { path :"personnes", component : PersonneComponent},
      { path :"new-person", component : NewPersonneComponent}
    ]},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
