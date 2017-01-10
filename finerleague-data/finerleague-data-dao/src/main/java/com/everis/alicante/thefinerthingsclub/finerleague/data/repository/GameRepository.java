package com.everis.alicante.thefinerthingsclub.finerleague.data.repository;

import com.everis.alicante.thefinerthingsclub.finerleague.data.entity.Game;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface GameRepository extends MongoRepository<Game, String> {
}
