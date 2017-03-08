import { Input, Component, OnInit } from '@angular/core';

import {Menu} from './menu';

@Component({
  selector: 'app-nav',
  templateUrl: './nav.component.html',
  styleUrls: ['./nav.component.css']
})
export class NavComponent implements OnInit {
    public menus: Menu[];
  
    ngOnInit() {
        this.menus = [
            new Menu("Login", "/login"),
            new Menu("Games", "/games")
        ];
    }
    constructor() { }
}