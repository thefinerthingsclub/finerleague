package com.everis.alicante.thefinerthingsclub.finerleague.data.repository;

import com.everis.alicante.thefinerthingsclub.finerleague.data.entity.Person;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * The interface Person dao.
 */
public interface PersonRepository extends MongoRepository <Person, String>{
}
