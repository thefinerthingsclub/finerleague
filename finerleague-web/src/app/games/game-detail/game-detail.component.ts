import { Component, OnInit } from '@angular/core';

import { Router, ActivatedRoute } from '@angular/router';
import { Game } from '../shared/game';
import { GameService } from '../shared/game.service';

import 'rxjs/add/operator/switchMap';
import 'rxjs/add/operator/map';

@Component({
  selector: 'ftc-game-detail',
  templateUrl: './game-detail.component.html',
  styleUrls: ['./game-detail.component.css']
})
export class GameDetailComponent implements OnInit {
  game: Game;

  constructor(
    private route: ActivatedRoute,
    private router: Router,
    private service: GameService
  ) {}

  ngOnInit() {
    let that = this;
    this.route.params.subscribe(params => {
      let id = params["id"];

      this.service.findById(id).subscribe(g => {
        that.game = g
      });
    });
  }
}
