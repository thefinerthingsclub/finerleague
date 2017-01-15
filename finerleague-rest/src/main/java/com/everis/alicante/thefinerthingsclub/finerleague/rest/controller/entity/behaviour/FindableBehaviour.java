package com.everis.alicante.thefinerthingsclub.finerleague.rest.controller.entity.behaviour;

import com.everis.alicante.thefinerthingsclub.finerleague.core.manager.AbstractManager;
import com.everis.alicante.thefinerthingsclub.finerleague.data.entity.EntityDocument;
import com.everis.alicante.thefinerthingsclub.finerleague.rest.dto.ControllerObjectDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/**
 * The interface Findable behaviour.
 *
 * @param <M>  the manager type
 * @param <O>  the DTO type
 * @param <E>  the entity type
 * @param <ID> the id type
 */
public interface FindableBehaviour<M extends AbstractManager, O extends ControllerObjectDTO, E extends EntityDocument, ID extends Serializable> extends ControllerGenericBehaviour<M, O, E, ID> {

    /**
     * Find all response entity.
     *
     * @return the response entity
     * @throws InvocationTargetException the invocation target exception
     * @throws IllegalAccessException    the illegal access exception
     */
    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    default public ResponseEntity<List<O>> findAll() throws InvocationTargetException, IllegalAccessException {
        return new ResponseEntity(this.convertToDto(getManager().findAll()), HttpStatus.OK);
    }

    /**
     * Find by id response entity.
     *
     * @param id the id
     * @return the response entity
     * @throws InvocationTargetException the invocation target exception
     * @throws IllegalAccessException    the illegal access exception
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    default public ResponseEntity<O> findById(final @PathVariable ID id) throws InvocationTargetException, IllegalAccessException {
        return new ResponseEntity(this.convertToDto((E) getManager().findOne(id)), HttpStatus.OK);
    }


}
