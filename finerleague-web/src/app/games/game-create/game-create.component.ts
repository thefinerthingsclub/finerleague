import { Component } from '@angular/core';
import { Game } from '../shared/game';
import { GameService } from '../shared/game.service';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';

@Component({
  selector: 'ftc-game-create',
  templateUrl: './game-create.component.html',
  styleUrls: ['./game-create.component.css']
})
export class GameCreateComponent {

  gameForm: FormGroup;


  constructor(private fb: FormBuilder, private gameService: GameService) {
    this.createForm();
  }

  createForm() {
    this.gameForm = this.fb.group({
      name: ['', Validators.required ]
    });
  }

  saveGame() {
    this.gameService.save(this.prepareGame()).subscribe();
  }

  prepareGame() {
    let game: Game = new Game(
      null,
      this.gameForm.value.name,
      'asd'
      );
    return game;
  }

}
