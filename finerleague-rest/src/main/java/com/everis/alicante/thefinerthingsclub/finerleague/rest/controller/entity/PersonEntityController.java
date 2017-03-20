package com.everis.alicante.thefinerthingsclub.finerleague.rest.controller.entity;

import com.everis.alicante.thefinerthingsclub.finerleague.core.manager.PersonManager;
import com.everis.alicante.thefinerthingsclub.finerleague.data.entity.Person;
import com.everis.alicante.thefinerthingsclub.finerleague.rest.dto.repository.PersonDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * The type PersonDTO controller.
 */
@RestController
@RequestMapping("/api/person")
public class PersonEntityController extends AbstractEntityController<PersonManager, PersonDTO, Person, String> {

    /**
     * Instantiates a new PersonDTO controller.
     *
     * @param personManager the person manager
     */
    @Autowired
    public PersonEntityController(final PersonManager personManager) {
        super(personManager, PersonDTO.class, Person.class);
    }

}
