import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule }    from '@angular/forms';

import { gamesRoutedComponents, GamesRoutingModule} from './games-routing.module';
import { GameService } from './shared/game.service';

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    GamesRoutingModule
  ],
  declarations: [gamesRoutedComponents],
  providers: [ GameService ]
})
export class GamesModule { }
