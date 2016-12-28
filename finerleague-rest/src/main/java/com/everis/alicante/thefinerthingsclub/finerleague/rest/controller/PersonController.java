package com.everis.alicante.thefinerthingsclub.finerleague.rest.controller;

import com.everis.alicante.thefinerthingsclub.finerleague.core.manager.PersonManager;
import com.everis.alicante.thefinerthingsclub.finerleague.data.entity.Person;
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
public class PersonController {

    @Autowired
    private PersonManager personManager;

    /**
     * Find all response entity.
     *
     * @return the response entity
     */
    @RequestMapping(value = "filter", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<List<Person>> findAll() {
        return new ResponseEntity(personManager.findAll(), HttpStatus.OK);
    }

    /**
     * Save response entity.
     *
     * @return the response entity
     */
    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<Person> save() {
        Person person = new Person();
        person.setName("Name1");
        person.setEmail("email@email.com");
        return new ResponseEntity(personManager.save(person), HttpStatus.CREATED);
    }
}
