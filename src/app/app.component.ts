import { Component } from '@angular/core';
import { Router } from '@angular/router';

import { AuthenticationService } from './_services';
import { User } from './_models';

@Component({ selector: 'app', templateUrl: 'app.component.html' })
export class AppComponent {
    currentUser: User;

    constructor(
        private router: Router,
        private authenticationService: AuthenticationService
    ) {
        this.authenticationService.currentUser.subscribe(x => this.currentUser = x);
    }
    logout() {
        this.authenticationService.logout();
        this.router.navigate(['/login']);
    }
    ImportData() {
        this.router.navigate(['/importdata']);
    }
    ManageCompany() {
        this.router.navigate(['/managecompany']);
    }
    ManageExchange() {
        this.router.navigate(['/manageexchange']);
    }
    UpdataIPODetail() {
        this.router.navigate(['/updateipodetail']);
    }
    CompareCompany() {
        this.router.navigate(['/comparecompany']);
    }
}