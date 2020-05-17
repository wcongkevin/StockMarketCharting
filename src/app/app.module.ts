import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule,ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule, HTTP_INTERCEPTORS } from '@angular/common/http';

// used to create fake backend
import { fakeBackendProvider } from './_helpers';

import { AppComponent } from './app.component';
import { routing } from './app.routing';
import { companyrouting } from './managecompany/managecompany.routing';

import { AlertComponent } from './_components';
import { JwtInterceptor, ErrorInterceptor } from './_helpers';
import { HomeComponent } from './home';
import { LoginComponent } from './login';
import { ImportdataComponent } from './importdata';
import { ManagecompanyComponent } from './managecompany';
import { ManageexchangeComponent } from './manageexchange';
import { UpdateIPODetailComponent } from './updateipodetail';
import { NewcompanyComponent } from './newcompany';
//ComparecompanyComponent
import { ComparecompanyComponent } from './comparecompany';
import { RegisterComponent } from './register';


@NgModule({
    imports: [
        BrowserModule,
        FormsModule,
        ReactiveFormsModule,
        HttpClientModule,
        companyrouting,
        routing
    ],
    declarations: [
        AppComponent,
        AlertComponent,
        HomeComponent,
        LoginComponent,
        ImportdataComponent,
        ManagecompanyComponent,
        ManageexchangeComponent,
        UpdateIPODetailComponent,
        NewcompanyComponent,
        ComparecompanyComponent,
        RegisterComponent
    ],
    providers: [
        { provide: HTTP_INTERCEPTORS, useClass: JwtInterceptor, multi: true },
        { provide: HTTP_INTERCEPTORS, useClass: ErrorInterceptor, multi: true },

        // provider used to create fake backend
        fakeBackendProvider
    ],
    bootstrap: [AppComponent]
})

export class AppModule { }