import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LoginComponent } from './shared/login/login.component';
import { PageNotFoundComponent } from './shared/not-found/not-found.component';
import {AuthGuard} from "./core/auth.guard";


export const appRoutes: Routes = [
  {path: '', pathMatch: 'full', redirectTo: 'login'},
  {path: 'login', component: LoginComponent},
  {path: 'games', loadChildren: 'app/games/games.module#GamesModule', canActivate: [AuthGuard]},
  {path: 'users', loadChildren: 'app/users/users.module#UsersModule', canActivate: [AuthGuard]},
  { path: '**', component: PageNotFoundComponent }
];


@NgModule({
    imports: [RouterModule.forRoot(appRoutes, { useHash: true })],
    exports: [RouterModule]
})
export class AppRoutingModule {}
