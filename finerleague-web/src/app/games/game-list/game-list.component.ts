import { Component, OnInit } from '@angular/core';


import { Router, ActivatedRoute, Params } from '@angular/router';
import { Game } from '../shared/game';
import { GameService } from '../shared/game.service';

import {Observable} from 'rxjs/Observable';
import 'rxjs/add/operator/map'

@Component({
  selector: 'game-list',
  templateUrl: './game-list.component.html',
  styleUrls: ['./game-list.component.css']
})
export class GameListComponent implements OnInit {
  title: string = 'List of Games';
  games: Game[];
  
  constructor(
    private service: GameService,
    private route: ActivatedRoute,
    private router: Router
  ) {}

  ngOnInit() {
      this.route.params
          .map((params: Params) => this.service.findAll())
          .subscribe((games: Game[])=> this.games = games);
  }

  onSelect(game: Game) {
    this.router.navigate(['/games/detail', game.id]);
  }
}
