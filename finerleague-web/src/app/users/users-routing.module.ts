import { NgModule } from '@angular/core';

import { Routes, RouterModule } from '@angular/router';
import { UsersComponent } from './users.component';
import { UserListComponent } from './user-list/user-list.component';

export const userRoutes: Routes = <Routes>[
    {
        path: '',
        component: UsersComponent,
        children: [
            {
                path: '',
                component: UserListComponent
            }
        ]
    }
];

@NgModule({
    imports: [RouterModule.forChild(userRoutes)],
    exports: [RouterModule]
})
export class UsersRoutingModule {}

export const usersRoutedComponents = [
  UsersComponent,
  UserListComponent
];
