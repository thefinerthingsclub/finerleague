package com.everis.alicante.thefinerthingsclub.finerleague.data.repository

import com.everis.alicante.thefinerthingsclub.finerleague.data.entity.Person
import org.springframework.beans.factory.annotation.Autowired

class PersonRepositoryIT extends AbstractDataLayerIT<Person, String, PersonRepository> {

    @Autowired
    PersonRepository repository;

    @Override
    Person createEntity() {
        def division = new Person();
        division.setName("name")
        return division;
    }

    @Override
    PersonRepository getRepository() {
        return repository;
    }
}
