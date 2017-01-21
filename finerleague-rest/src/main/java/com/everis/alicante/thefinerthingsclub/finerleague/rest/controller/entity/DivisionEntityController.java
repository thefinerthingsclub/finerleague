package com.everis.alicante.thefinerthingsclub.finerleague.rest.controller.entity;

import com.everis.alicante.thefinerthingsclub.finerleague.core.manager.DivisionManager;
import com.everis.alicante.thefinerthingsclub.finerleague.data.entity.Division;
import com.everis.alicante.thefinerthingsclub.finerleague.rest.dto.repository.DivisionDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/division")
public class DivisionEntityController extends AbstractEntityController<DivisionManager, DivisionDTO, Division, String> {

    @Autowired
    public DivisionEntityController(final DivisionManager divisionManager) {
        super(divisionManager, DivisionDTO.class, Division.class);
    }
}
