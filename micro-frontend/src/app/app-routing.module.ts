import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { PersonneComponent } from './personne/personne.component';
import { CretePersonneComponent } from './crete-personne/crete-personne.component';
import { UpdatePersonneComponent } from './update-personne/update-personne.component';
import { PersonneDetailsComponent } from './personne-details/personne-details.component';
import {ImmeublesComponent} from "./immeubles/immeubles/immeubles.component";
import {CreateImmeubleComponent} from "./immeubles/create-immeuble/create-immeuble.component";
import {ContratsComponent} from "./contrat/contrats/contrats.component";
import {CreateContratComponent} from "./contrat/create-contrat/create-contrat.component";
import {HomeComponent} from "./home/home/home.component";
import {HeaderComponent} from "./header/header.component";
import {FooterComponent} from "./footer/footer.component";
import {ConnexionComponent} from "./connexion/connexion.component";
import {InscriptionComponent} from "./inscription/inscription.component";

const routes: Routes = [
  {path: 'home', component: HomeComponent},
  {path: 'personnes', component: PersonneComponent},
  {path: 'create-personne', component: CretePersonneComponent},
  {path: 'immeubles', component: ImmeublesComponent},
  {path: 'create-immeuble', component: CreateImmeubleComponent},
  {path: 'contrats', component: ContratsComponent},
  {path: 'create-contrat', component: CreateContratComponent},
  {path: 'header', component: HeaderComponent},
  {path: 'footer', component: FooterComponent},
  {path: 'connexion', component: ConnexionComponent},
  {path: 'inscription', component: InscriptionComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
