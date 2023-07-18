import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { PersonneComponent } from './personne/personne.component';
import { CretePersonneComponent } from './crete-personne/crete-personne.component';
import { UpdatePersonneComponent } from './update-personne/update-personne.component';
import { PersonneDetailsComponent } from './personne-details/personne-details.component';

const routes: Routes = [
  {path: 'personnes', component: PersonneComponent},
  {path: 'create-personne', component: CretePersonneComponent},
  {path: 'update-personne/:idPers', component: UpdatePersonneComponent},
  {path: 'personne-details/:idPers', component: PersonneDetailsComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
