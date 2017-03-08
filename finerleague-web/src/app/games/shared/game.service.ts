import { Injectable } from '@angular/core';

import { Game } from './game';

@Injectable()
export class GameService {

  constructor() { }

    findById(id: string){
        return new Game(id, "Game " + id, "image" + id + ".png");
    }
    findAll(){      
        return [
            new Game("1", "Game 1", "image1.png"),
            new Game("2", "Game 2", "image2.png"),
            new Game("3", "Game 3", "image3.png")
        ];
    }
}
