package com.everis.alicante.thefinerthingsclub.finerleague.rest.controller;

import com.everis.alicante.thefinerthingsclub.finerleague.core.manager.DivisionManager;
import com.everis.alicante.thefinerthingsclub.finerleague.data.entity.Division;
import com.everis.alicante.thefinerthingsclub.finerleague.rest.dto.DivisionDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

/**
 * The type Division controller.
 */
@RestController
@RequestMapping("/division")
public class DivisionController extends AbstractController<DivisionDTO, Division> {

    @Autowired
    private DivisionManager divisionManager;

    /**
     * Instantiates a new Abstract controller.
     */
    protected DivisionController() {
        super(DivisionDTO.class, Division.class);
    }

    /**
     * Find all response entity.
     *
     * @return the response entity
     */
    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<List<DivisionDTO>> findAll() throws InvocationTargetException, IllegalAccessException {
        return new ResponseEntity(super.convertToDto(divisionManager.findAll()), HttpStatus.OK);
    }

    /**
     * Save response entity.
     *
     * @param divisionDTO the division dto
     * @return the response entity
     * @throws InvocationTargetException the invocation target exception
     * @throws IllegalAccessException    the illegal access exception
     */
    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<DivisionDTO> save(final DivisionDTO divisionDTO) throws InvocationTargetException, IllegalAccessException {
        final Division newDivision = divisionManager.save(super.convertToEntity(divisionDTO));
        return new ResponseEntity(super.convertToDto(newDivision), HttpStatus.CREATED);
    }

}
