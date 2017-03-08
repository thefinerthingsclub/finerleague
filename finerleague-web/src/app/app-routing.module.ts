import { NgModule } from '@angular/core';

import { Routes, RouterModule } from '@angular/router';
import { LoginComponent } from './shared/login/login.component';
import { HomeComponent } from './home/home.component';
import { PageNotFoundComponent } from './shared/not-found/not-found.component';

export const appRoutes: Routes = [
    {path: '', pathMatch: 'full', redirectTo: 'home'},
    {path: 'login', component: LoginComponent},
    {path: 'home', component: HomeComponent},
    { path: '**', component: PageNotFoundComponent }
];

@NgModule({
    imports: [RouterModule.forRoot(appRoutes)],
    exports: [RouterModule]
})
export class AppRoutingModule {}

export const routedComponents = [LoginComponent, HomeComponent, PageNotFoundComponent];
