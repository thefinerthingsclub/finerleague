package com.everis.alicante.thefinerthingsclub.finerleague.data.dao;

import com.everis.alicante.thefinerthingsclub.finerleague.data.entity.Person;
import com.everis.alicante.thefinerthingsclub.finerleague.data.entity.Team;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * The interface Person dao.
 */
public interface TeamRepository extends MongoRepository <Team, String>{
}
