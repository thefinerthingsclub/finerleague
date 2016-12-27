package com.everis.alicante.thefinerthingsclub.finerleague.rest.controller;

import com.everis.alicante.thefinerthingsclub.finerleague.core.manager.DivisionManager;
import com.everis.alicante.thefinerthingsclub.finerleague.data.entity.Division;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * The type Division controller.
 */
@RestController
@RequestMapping("/division")
public class DivisionController {

    @Autowired
    private DivisionManager divisionManager;

    /**
     * Find all response entity.
     *
     * @return the response entity
     */
    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<List<Division>> findAll() {
        return new ResponseEntity(divisionManager.findAll(), HttpStatus.OK);
    }

    /**
     * Save response entity.
     *
     * @return the response entity
     */
    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<Division> save() {
        Division division = new Division();
        division.setName("Name1");
        division.setPriority(1);
        return new ResponseEntity(divisionManager.save(division), HttpStatus.CREATED);
    }

}
