package com.everis.alicante.thefinerthingsclub.finerleague.core.manager;

import com.everis.alicante.thefinerthingsclub.finerleague.data.repository.GameRepository;
import com.everis.alicante.thefinerthingsclub.finerleague.data.entity.Game;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * The type Game manager.
 */
@Service
public class GameManager extends AbstractManager<GameRepository, Game, String> {

    /**
     * Instantiates a new Game manager.
     *
     * @param gameRepository the game repository
     */
    @Autowired
    public GameManager(GameRepository gameRepository) {
        super(gameRepository);
    }
}
