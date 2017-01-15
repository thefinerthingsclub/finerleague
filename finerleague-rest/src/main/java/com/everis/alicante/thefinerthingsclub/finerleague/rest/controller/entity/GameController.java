package com.everis.alicante.thefinerthingsclub.finerleague.rest.controller.entity;

import com.everis.alicante.thefinerthingsclub.finerleague.core.manager.GameManager;
import com.everis.alicante.thefinerthingsclub.finerleague.data.entity.Game;
import com.everis.alicante.thefinerthingsclub.finerleague.rest.controller.entity.behaviour.AllBehaviour;
import com.everis.alicante.thefinerthingsclub.finerleague.rest.dto.repository.GameDTO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/game")
public class GameController extends AbstractController<GameManager, GameDTO, Game, String> implements AllBehaviour<GameManager, GameDTO, Game, String> {

    public GameController(GameManager gameManager) {
        super(gameManager, GameDTO.class, Game.class);
    }
}
