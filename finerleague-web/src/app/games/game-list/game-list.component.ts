import { Component, OnInit } from '@angular/core';

import { Router, ActivatedRoute, Params } from '@angular/router';
import { Game } from '../shared/game';
import { GameService } from '../shared/game.service';
import { SpinnerService } from '../../core/spinner/spinner.service';

import {Observable} from 'rxjs/Observable';
import 'rxjs/add/operator/map'

@Component({
  moduleId: module.id,
  selector: 'game-list',
  templateUrl: './game-list.component.html',
  styleUrls: ['./game-list.component.css']
})
export class GameListComponent implements OnInit {
  public isRequesting: boolean = false;
  title: string = 'List of Games';
  games: Game[];

  constructor(
    private service: GameService,
    private route: ActivatedRoute,
    private router: Router,
    private spinnerService: SpinnerService
  ) {}

  ngOnInit() {
      this.spinnerService.show();
      this.isRequesting = true;
      this.route.params
          .map((params: Params) => this.service.findAll())
          .subscribe((games: Game[])=> {
              this.games = games;

              var that = this;
              setTimeout(function(){
                that.spinnerService.hide();
              }, 3000);
      });
  }

  onSelect(game: Game) {
    this.router.navigate(['/games/detail', game.id]);
  }
}
