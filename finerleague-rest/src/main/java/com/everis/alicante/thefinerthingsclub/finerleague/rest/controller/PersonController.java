package com.everis.alicante.thefinerthingsclub.finerleague.rest.controller;

import com.everis.alicante.thefinerthingsclub.finerleague.core.manager.PersonManager;
import com.everis.alicante.thefinerthingsclub.finerleague.data.entity.Person;
import com.everis.alicante.thefinerthingsclub.finerleague.rest.repository.PersonDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * The type Person controller.
 */
@RestController
@RequestMapping("/person")
public class PersonController extends AbstractController<PersonManager, PersonDTO, Person> {

    /**
     * Instantiates a new Person controller.
     *
     * @param personManager the person manager
     */
    @Autowired
    public PersonController(final PersonManager personManager) {
        super(personManager, PersonDTO.class, Person.class);
    }

}
