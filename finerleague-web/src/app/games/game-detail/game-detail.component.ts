import { Component, OnInit } from '@angular/core';

import { Router, ActivatedRoute, Params } from '@angular/router';
import { Game } from '../shared/game';
import { GameService } from '../shared/game.service';
import {Observable} from 'rxjs/Observable';
import 'rxjs/add/operator/switchMap';
import 'rxjs/add/operator/map';

@Component({
  moduleId: module.id,
  selector: 'game-detail',
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
