package com.everis.alicante.thefinerthingsclub.finerleague.rest.controller;

import com.everis.alicante.thefinerthingsclub.finerleague.core.manager.GameManager;
import com.everis.alicante.thefinerthingsclub.finerleague.core.manager.PersonManager;
import com.everis.alicante.thefinerthingsclub.finerleague.data.entity.Game;
import com.everis.alicante.thefinerthingsclub.finerleague.data.entity.Person;
import com.everis.alicante.thefinerthingsclub.finerleague.rest.repository.GameDTO;
import com.everis.alicante.thefinerthingsclub.finerleague.rest.repository.PersonDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/game")
public class GameController extends AbstractController<GameManager, GameDTO, Game> {

    public GameController(GameManager gameMaager) {
        super(gameMaager, GameDTO.class, Game.class);
    }
}
