package com.everis.alicante.thefinerthingsclub.finerleague.data.repository;


import com.everis.alicante.thefinerthingsclub.finerleague.data.entity.Session;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface SessionRepository extends MongoRepository<Session, String> {

    Session getSession(final String token, Boolean valid);
}
