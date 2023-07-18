import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { PersonneComponent } from './personne/personne.component';
import { CretePersonneComponent } from './crete-personne/crete-personne.component';
import { UpdatePersonneComponent } from './update-personne/update-personne.component';
import { PersonneDetailsComponent } from './personne-details/personne-details.component';
import {FormsModule} from "@angular/forms";
import {HttpClientModule} from "@angular/common/http";

@NgModule({
  declarations: [
    AppComponent,
    PersonneComponent,
    CretePersonneComponent,
    UpdatePersonneComponent,
    PersonneDetailsComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
