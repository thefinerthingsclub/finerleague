package com.everis.alicante.thefinerthingsclub.finerleague.data.dao;

import com.everis.alicante.thefinerthingsclub.finerleague.data.entity.Division;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * The interface Division repository.
 */
public interface DivisionRepository extends MongoRepository<Division, String> {
}
