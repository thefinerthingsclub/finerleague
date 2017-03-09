import { Component, OnInit } from '@angular/core';

import { Router, ActivatedRoute, Params } from '@angular/router';
import { Game } from '../shared/game';
import { GameService } from '../shared/game.service';
import 'rxjs/add/operator/switchMap';
import 'rxjs/add/operator/map'

@Component({
  moduleId: module.id,
  selector: 'game-detail',
  templateUrl: './game-detail.component.html',
  styleUrls: ['./game-detail.component.css']
})
export class GameDetailComponent implements OnInit {
  title = "Game Details";
  game: Game;

  constructor(
    private route: ActivatedRoute,
    private router: Router,
    private service: GameService
  ) {}

  ngOnInit() {
    this.route.params
        .map((params: Params) => this.service.findById(params["id"]))
        .subscribe((game: Game) => this.game = game);
  }

}
