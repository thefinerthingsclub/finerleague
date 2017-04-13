import { Input, Component, OnInit } from '@angular/core';

import {Menu} from './menu';

@Component({
  selector: 'ftc-nav',
  templateUrl: './nav.component.html',
  styleUrls: ['./nav.component.css']
})
export class NavComponent implements OnInit {
    public menus: Menu[];

    ngOnInit() {
        this.menus = [
            new Menu('Login', '/login'),
            new Menu('Games', '/games'),
            new Menu('Users', '/users')
        ];
    }
    constructor() { }
}
