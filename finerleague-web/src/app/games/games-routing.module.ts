import { NgModule } from '@angular/core';

import { Routes, RouterModule } from '@angular/router';
import { GameListComponent } from './game-list/game-list.component';
import { GameCreateComponent } from './game-create/game-create.component';
import { GameDetailComponent } from './game-detail/game-detail.component';

export const gameRoutes: Routes = [
    {path: '', pathMatch: 'full', redirectTo: 'games'},
    {path: 'games', component: GameListComponent},
    {path: 'games/createNew', component: GameCreateComponent},
    {path: 'games/detail/:id', component: GameDetailComponent}
];

@NgModule({
    imports: [RouterModule.forChild(gameRoutes)],
    exports: [RouterModule]
})
export class GamesRoutingModule {}

export const gamesRoutedComponents = [GameListComponent, GameCreateComponent, GameDetailComponent];
