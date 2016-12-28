package com.everis.alicante.thefinerthingsclub.finerleague.core.manager;

import com.everis.alicante.thefinerthingsclub.finerleague.data.dao.GameRepository;
import com.everis.alicante.thefinerthingsclub.finerleague.data.entity.Game;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameManager {

    @Autowired
    GameRepository gameRepository;

    /**
     * Find all list.
     *
     * @return the list
     */
    public List<Game> findAll() {
        return gameRepository.findAll();
    }

    /**
     * Find one person.
     *
     * @param id the id
     * @return the person
     */
    public Game findOne(final String id) {
        return gameRepository.findOne(id);

    }

    /**
     * Exists boolean.
     *
     * @param id the id
     * @return the boolean
     */
    public boolean exists(final String id) {
        return gameRepository.exists(id);
    }

    /**
     * Delete.
     *
     * @param id the id
     */
    public void delete(final String id) {
        gameRepository.delete(id);
    }

    /**
     * Save person.
     *
     * @param game the person
     * @return the person
     */
    public Game save(final Game game) {
        return gameRepository.save(game);
    }
}
