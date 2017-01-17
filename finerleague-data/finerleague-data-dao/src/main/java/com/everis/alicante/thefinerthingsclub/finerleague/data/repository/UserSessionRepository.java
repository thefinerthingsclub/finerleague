package com.everis.alicante.thefinerthingsclub.finerleague.data.repository;


import com.everis.alicante.thefinerthingsclub.finerleague.data.entity.Team;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserSessionRepository extends MongoRepository<Team, String> {
}
