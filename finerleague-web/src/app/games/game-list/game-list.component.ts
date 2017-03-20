import { Component, OnInit } from '@angular/core';

import { Router, ActivatedRoute, Params } from '@angular/router';
import { Game } from '../shared/game';
import { GameService } from '../shared/game.service';
import { SpinnerService } from '../../core/spinner/spinner.service';
import { LoggerService } from '../../core/logger.service';

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
  games: Game[];

  constructor(
    private loggerService: LoggerService,
    private service: GameService,
    private route: ActivatedRoute,
    private router: Router,
    private spinnerService: SpinnerService
  ) {}

  ngOnInit() {
      this.loggerService.log('... initializing game list component.');
      this.spinnerService.show();
      this.isRequesting = true;

      this.service.findAll()
          .subscribe(games => {
            this.games = games;

            //TODO remove this part in real app leaving the hide of the spinner.
            var that = this;
            setTimeout(function(){
              that.spinnerService.hide();
            }, 3000);
          }, err => {
              // Log errors if any
              console.log(err);
          });
  }

  onSelect(game: Game) {
    this.router.navigate(['/games/detail', game.id]);
  }
}
