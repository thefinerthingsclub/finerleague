package com.everis.alicante.thefinerthingsclub.finerleague.data.repository

import com.everis.alicante.thefinerthingsclub.finerleague.data.config.AbstractDataLayerIT
import com.everis.alicante.thefinerthingsclub.finerleague.data.entity.Division
import org.springframework.beans.factory.annotation.Autowired

class DivisionRepositoryIT extends AbstractDataLayerIT {

    @Autowired
    DivisionRepository divisionRepository;

    def setup() {
//        divisionRepository.deleteAll();
    }

    def "test save"() {
        given:
        def division = new Division();
        division.setName("name")
        division.setPriority(1)
        when:
        def newDivision = divisionRepository.save(division);
        then:
        newDivision.getId() != null
    }
}
