import { NgModule } from '@angular/core';

import { SharedModule } from '../shared/shared.module';
import { usersRoutedComponents, UsersRoutingModule} from './users-routing.module';

@NgModule({
  imports: [
    SharedModule,
    UsersRoutingModule
  ],
  declarations: [usersRoutedComponents],
  providers: []
})
export class UsersModule { }
