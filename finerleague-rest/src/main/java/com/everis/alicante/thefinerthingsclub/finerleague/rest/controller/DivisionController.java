package com.everis.alicante.thefinerthingsclub.finerleague.rest.controller;

import com.everis.alicante.thefinerthingsclub.finerleague.core.manager.DivisionManager;
import com.everis.alicante.thefinerthingsclub.finerleague.data.entity.Division;
import com.everis.alicante.thefinerthingsclub.finerleague.rest.behaviour.DeletableBehaviour;
import com.everis.alicante.thefinerthingsclub.finerleague.rest.repository.DivisionDTO;
import org.aspectj.lang.annotation.DeclareMixin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;

@RestController
@RequestMapping("/division")
public class DivisionController extends AbstractController<DivisionManager, DivisionDTO, Division, String> implements DeletableBehaviour<DivisionManager, String> {

    @Autowired
    public DivisionController(final DivisionManager divisionManager) {
        super(divisionManager, DivisionDTO.class, Division.class);
    }
}
