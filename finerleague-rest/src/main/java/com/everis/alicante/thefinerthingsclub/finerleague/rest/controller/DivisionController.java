package com.everis.alicante.thefinerthingsclub.finerleague.rest.controller;

import com.everis.alicante.thefinerthingsclub.finerleague.core.manager.DivisionManager;
import com.everis.alicante.thefinerthingsclub.finerleague.data.entity.Division;
import com.everis.alicante.thefinerthingsclub.finerleague.rest.repository.DivisionDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * The type Division controller.
 */
@RestController
@RequestMapping("/division")
public class DivisionController extends AbstractController<DivisionManager, DivisionDTO, Division> {

    /**
     * Instantiates a new Abstract controller.
     */
    @Autowired
    public DivisionController(final DivisionManager divisionManager) {
        super(divisionManager, DivisionDTO.class, Division.class);
    }

}
