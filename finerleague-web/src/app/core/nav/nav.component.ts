import { Component, OnInit } from '@angular/core';

import { Menu } from './menu';

@Component({
  selector: 'ftc-nav',
  templateUrl: './nav.component.html',
  styleUrls: ['./nav.component.css']
})
export class NavComponent implements OnInit {
    public menus: Menu[];

    ngOnInit() {
        this.menus = [
            new Menu('Login', '/login', 'fa-home'),
            new Menu('Games', '', 'fa-gamepad', [
              new Menu('Show all', '/games', 'fa-gamepad'),
              new Menu('Users', '/users', 'fa-gamepad'),
              new Menu('Not Found', '/asdasd', 'fa-gamepad')
            ]),
            new Menu('Users', '/users', 'fa-users')
        ];
    }
    constructor() { }
}
