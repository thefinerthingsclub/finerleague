import { NgModule } from '@angular/core';

import { SharedModule }     from './shared/shared.module';
import { CoreModule }    from './core/core.module';
import { GamesModule }     from './games/games.module';
import { AppRoutingModule} from './app-routing.module';

import { AppComponent } from './app.component';

@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    GamesModule,
    AppRoutingModule,
    SharedModule,
    CoreModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
