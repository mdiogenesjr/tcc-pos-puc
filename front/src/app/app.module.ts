import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppComponent } from './app.component';

import { PhotosModule } from './photos/photos.module';
import { AppRoutingModule } from './app.routing.module';
import { ErrorsModule } from './errors/errors.module';
import { HomeModule } from './home/home.module';
import { CoreModule } from './core/core.module';
import { ConsultoriasComponent } from './consultorias/consultorias.component';
import { NormasComponent } from './normas/normas.component';
import { ProcessosComponent } from './processos/processos.component';

@NgModule({
  declarations: [
    AppComponent,
    ConsultoriasComponent,
    NormasComponent,
    ProcessosComponent
  ],
  imports: [
    BrowserModule,
    PhotosModule,
    AppRoutingModule,
    ErrorsModule,
    HomeModule,
    CoreModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
