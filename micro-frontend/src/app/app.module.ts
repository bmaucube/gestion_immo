import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { PersonneComponent } from './personne/personne.component';
import { CretePersonneComponent } from './crete-personne/crete-personne.component';
import { UpdatePersonneComponent } from './update-personne/update-personne.component';
import { PersonneDetailsComponent } from './personne-details/personne-details.component';
import {FormsModule} from "@angular/forms";
import {HTTP_INTERCEPTORS, HttpClientModule} from "@angular/common/http";
import { ImmeublesComponent } from './immeubles/immeubles/immeubles.component';
import { CreateImmeubleComponent } from './immeubles/create-immeuble/create-immeuble.component';
import { ContratsComponent } from './contrat/contrats/contrats.component';
import { CreateContratComponent } from './contrat/create-contrat/create-contrat.component';
import { HomeComponent } from './home/home/home.component';
import { HeaderComponent } from './header/header.component';
import { FooterComponent } from './footer/footer.component';
import { InscriptionComponent } from './inscription/inscription.component';
import { ConnexionComponent } from './connexion/connexion.component';
import { LoginComponent } from './login/login.component';
import { AdminTemplateComponent } from './admin-template/admin-template.component';
import {AppHttpInterceptor} from "./interceptors/app-http.interceptor";

@NgModule({
  declarations: [
    AppComponent,
    PersonneComponent,
    CretePersonneComponent,
    UpdatePersonneComponent,
    PersonneDetailsComponent,
    ImmeublesComponent,
    CreateImmeubleComponent,
    ContratsComponent,
    CreateContratComponent,
    HomeComponent,
    HeaderComponent,
    FooterComponent,
    InscriptionComponent,
    ConnexionComponent,
    LoginComponent,
    AdminTemplateComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [
    {
      provide: HTTP_INTERCEPTORS, useClass : AppHttpInterceptor, multi : true
    }
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
