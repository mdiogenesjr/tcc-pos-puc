import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { NotFoundComponent } from './errors/not-found/not-found.component';
import { SignInComponent } from './home/signin/signin.component';
import { AuthGuard } from './core/auth/auth.guard';
import { ConsultoriasComponent } from './consultorias/consultorias.component';
import { NormasComponent } from './normas/normas.component';
import { AuthGuardComponents } from './core/auth/auth.guard.components';
import { ProcessosComponent } from './processos/processos.component';

const routes: Routes = [
    { 
        path: '',
        component: SignInComponent,
        canActivate: [AuthGuard]
    },
    { 
        path: 'consultorias', 
        component: ConsultoriasComponent,
        canActivate: [AuthGuardComponents]
    },
    { 
        path: 'normas', 
        component: NormasComponent,
        canActivate: [AuthGuardComponents]
    },
    { 
        path: 'processos', 
        component: ProcessosComponent,
        canActivate: [AuthGuardComponents]
    },
    { 
        path: '**', 
        component: NotFoundComponent 
    }  
];

@NgModule({
    imports: [ 
        RouterModule.forRoot(routes) 
    ],
    exports: [ RouterModule ]
})
export class AppRoutingModule { }

