package com.everis.alicante.thefinerthingsclub.finerleague.data.repository

import com.everis.alicante.thefinerthingsclub.finerleague.data.entity.Division
import org.springframework.beans.factory.annotation.Autowired

class DivisionRepositoryIT extends AbstractDataLayerIT<Division, String, DivisionRepository> {

    @Autowired
    DivisionRepository divisionRepository;

    @Override
    Division createEntity() {
        def division = new Division();
        division.setName("name")
        division.setPriority(1)
        return division;
    }

    @Override
    DivisionRepository getRepository() {
        return divisionRepository;
    }
}
