package com.everis.alicante.thefinerthingsclub.finerleague.data.dao;

import com.everis.alicante.thefinerthingsclub.finerleague.data.entity.Division;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * The type Dvision dao.
 */
public interface DivisionDAO extends MongoRepository<Division, String> {

    @Override
    List<Division> findAll();

    @Override
    Division findOne(String id);

    @Override
    boolean exists(String id);

    @Override
    void delete(String id);

    @Override
    Division insert(Division division);
}
