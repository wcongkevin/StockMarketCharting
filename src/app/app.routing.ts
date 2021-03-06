﻿import { Routes, RouterModule } from '@angular/router';

import { HomeComponent } from './home';
import { LoginComponent } from './login';
import { ImportdataComponent } from './importdata';
import { ManagecompanyComponent } from './managecompany';
import { ManageexchangeComponent } from './manageexchange';
import { UpdateIPODetailComponent } from './updateipodetail';
import { ComparecompanyComponent } from './comparecompany';
import { RegisterComponent } from './register';
import { AuthGuard } from './_guards';

const appRoutes: Routes = [
    { path: '', component: HomeComponent, canActivate: [AuthGuard] },
    { path: 'login', component: LoginComponent },
    { path: 'register', component: RegisterComponent },
    { path: 'importdata', component: ImportdataComponent },
    { path: 'managecompany', component: ManagecompanyComponent },
    { path: 'manageexchange', component: ManageexchangeComponent },
    { path: 'updateipodetail', component: UpdateIPODetailComponent },
    { path: 'comparecompany', component: ComparecompanyComponent },

    // otherwise redirect to home
    { path: '**', redirectTo: '' }
];

export const routing = RouterModule.forRoot(appRoutes);