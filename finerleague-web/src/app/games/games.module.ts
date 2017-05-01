import { NgModule } from '@angular/core';

import { SharedModule } from '../shared/shared.module';
import { gamesRoutedComponents, GamesRoutingModule} from './games-routing.module';
import { ReactiveFormsModule } from '@angular/forms';
import { GameService } from './shared/game.service';

@NgModule({
  imports: [
    SharedModule,
    ReactiveFormsModule,
    GamesRoutingModule
  ],
  declarations: [gamesRoutedComponents],
  providers: [ GameService ]
})
export class GamesModule { }
