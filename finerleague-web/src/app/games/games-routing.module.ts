import { NgModule } from '@angular/core';

import { Routes, RouterModule } from '@angular/router';
import { GamesComponent } from './games.component';
import { GameListComponent } from './game-list/game-list.component';
import { GameCreateComponent } from './game-create/game-create.component';
import { GameDetailComponent } from './game-detail/game-detail.component';

export const gameRoutes: Routes = <Routes>[{
  path: '',
  component: GamesComponent,
  children: [
    { path: '', component: GameListComponent },
    { path: 'detail/:id', component: GameDetailComponent },
    { path: 'create', component: GameCreateComponent }
  ]
}];

@NgModule({
    imports: [RouterModule.forChild(gameRoutes)],
    exports: [RouterModule]
})

export class GamesRoutingModule {}

export const gamesRoutedComponents = [
  GamesComponent,
  GameListComponent,
  GameCreateComponent,
  GameDetailComponent
];
