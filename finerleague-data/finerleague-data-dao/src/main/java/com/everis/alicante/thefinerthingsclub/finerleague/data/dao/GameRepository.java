package com.everis.alicante.thefinerthingsclub.finerleague.data.dao;

import com.everis.alicante.thefinerthingsclub.finerleague.data.entity.Game;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface GameRepository extends MongoRepository<Game, String> {
}
