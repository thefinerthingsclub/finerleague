package com.everis.alicante.thefinerthingsclub.finerleague.rest.controller.entity;

import com.everis.alicante.thefinerthingsclub.finerleague.core.manager.AbstractManager;
import com.everis.alicante.thefinerthingsclub.finerleague.data.entity.EntityDocument;
import com.everis.alicante.thefinerthingsclub.finerleague.rest.controller.AbstractController;
import com.everis.alicante.thefinerthingsclub.finerleague.rest.dto.ControllerObjectDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/**
 * The type Abstract Entity Controller.
 *
 * @param <M>  the manager type
 * @param <O>  the DTO type
 * @param <E>  the entity type
 * @param <ID> the id type
 */
public abstract class AbstractEntityController<M extends AbstractManager, O extends ControllerObjectDTO, E extends EntityDocument, ID extends Serializable> extends AbstractController<M, O, E, ID> {

    /**
     * Instantiates a new Abstract controller.
     *
     * @param managerClass the manager class
     * @param dtoClass     the dto class
     * @param entityClass  the entity class
     */
    protected AbstractEntityController(final M managerClass, final Class<O> dtoClass, final Class<E> entityClass) {
        super(managerClass, dtoClass, entityClass);
    }

    /**
     * Find all response entity.
     *
     * @return the response entity
     * @throws InvocationTargetException the invocation target exception
     * @throws IllegalAccessException    the illegal access exception
     */
    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<List<O>> findAll() throws InvocationTargetException, IllegalAccessException {
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
    public ResponseEntity<O> findById(final @PathVariable ID id) throws InvocationTargetException, IllegalAccessException {
        return new ResponseEntity(this.convertToDto((E) getManager().findOne(id)), HttpStatus.OK);
    }

    /**
     * Save response entity.
     *
     * @param dto the dto
     * @return the response entity
     * @throws InvocationTargetException the invocation target exception
     * @throws IllegalAccessException    the illegal access exception
     */
    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<O> save(final @RequestBody O dto) throws InvocationTargetException, IllegalAccessException {
        final E newEntity = (E) getManager().save(this.convertToEntity(dto));
        return new ResponseEntity(this.convertToDto(newEntity), HttpStatus.CREATED);
    }

    /**
     * Delete.
     *
     * @param id the id
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(ID id) {
        getManager().delete(id);
    }

    /**
     * Delete.
     *
     * @param idList the id list
     */
    @RequestMapping(method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@RequestBody final List<ID> idList) {
        getManager().delete(idList);
    }

}
