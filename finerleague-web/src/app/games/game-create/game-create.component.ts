import { Component } from '@angular/core';
import { Game } from '../shared/game';
import { GameService } from '../shared/game.service';
import { Router, ActivatedRoute } from '@angular/router';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';

@Component({
  selector: 'ftc-game-create',
  templateUrl: './game-create.component.html',
  styleUrls: ['./game-create.component.css']
})
export class GameCreateComponent {

  gameForm: FormGroup;


  constructor(private fb: FormBuilder,
              private gameService: GameService,
              private route: ActivatedRoute,
              private router: Router) {
    this.createForm();
  }

  createForm() {
    this.gameForm = this.fb.group({
      name: ['', Validators.required ]
    });
  }

  saveGame() {
    this.gameService.save(this.prepareGame())
      .subscribe(
        (response) => {
          console.log('Success Response: ', response);
          this.router.navigate(['..'], { relativeTo: this.route });
        },
        (error) => { console.log('Error happened' + error); }
      );
  }

  prepareGame() {
    let game: Game = new Game(null, this.gameForm.value.name, null);
    return game;
  }

  reset() {
    this.gameForm.reset();
  }

}
