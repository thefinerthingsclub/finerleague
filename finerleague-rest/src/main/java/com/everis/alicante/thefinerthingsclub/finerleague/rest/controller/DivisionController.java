package com.everis.alicante.thefinerthingsclub.finerleague.rest.controller;

import com.everis.alicante.thefinerthingsclub.finerleague.core.manager.DivisionManager;
import com.everis.alicante.thefinerthingsclub.finerleague.data.entity.Division;
import com.everis.alicante.thefinerthingsclub.finerleague.rest.repository.DivisionDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.InvocationTargetException;

@RestController
@RequestMapping("/division")
public class DivisionController extends AbstractController<DivisionManager, DivisionDTO, Division, String> {

    @Autowired
    public DivisionController(final DivisionManager divisionManager) {
        super(divisionManager, DivisionDTO.class, Division.class);
    }

    @Override
    public ResponseEntity<DivisionDTO> findById(final String id) throws InvocationTargetException, IllegalAccessException {
        return new ResponseEntity(null, HttpStatus.METHOD_NOT_ALLOWED);
    }
}
