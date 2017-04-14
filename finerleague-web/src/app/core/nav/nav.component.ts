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
            new Menu('Games', '/games', 'fa-gamepad'),
            new Menu('Users', '/users', 'fa-users')
        ];
    }
    constructor() { }
}
