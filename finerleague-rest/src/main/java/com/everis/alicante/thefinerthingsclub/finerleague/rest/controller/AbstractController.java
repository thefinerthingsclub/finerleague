package com.everis.alicante.thefinerthingsclub.finerleague.rest.controller;

import com.everis.alicante.thefinerthingsclub.finerleague.core.manager.AbstractManager;
import com.everis.alicante.thefinerthingsclub.finerleague.data.entity.EntityDocument;
import com.everis.alicante.thefinerthingsclub.finerleague.rest.dto.ControllerObjectDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * The type Abstract controller.
 *
 * @param <M>  the type parameter
 * @param <O>  the DTO Type parameter
 * @param <E>  the Entity Type parameter
 * @param <ID> the type parameter
 */
public class AbstractController<M extends AbstractManager, O extends ControllerObjectDTO, E extends EntityDocument, ID extends Serializable> {

    private M manager;

    private Class<O> dtoClass;

    private Class<E> entityClass;

    @Autowired
    private ModelMapper modelMapper;

    /**
     * Instantiates a new Abstract controller.
     *
     * @param managerClass the manager class
     * @param dtoClass     the repository class
     * @param entityClass  the entity class
     */
    protected AbstractController(final M managerClass, final Class<O> dtoClass, final Class<E> entityClass) {
        this.dtoClass = dtoClass;
        this.entityClass = entityClass;
        this.manager = managerClass;
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
        return new ResponseEntity(this.convertToDto(this.manager.findAll()), HttpStatus.OK);
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
        return new ResponseEntity(this.convertToDto((E) this.manager.findOne(id)), HttpStatus.OK);
    }

    /**
     * Save response entity.
     *
     * @param dto the division repository
     * @return the response entity
     * @throws InvocationTargetException the invocation target exception
     * @throws IllegalAccessException    the illegal access exception
     */
    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<O> save(final O dto) throws InvocationTargetException, IllegalAccessException {
        final E newEntity = (E) this.manager.save(this.convertToEntity(dto));
        return new ResponseEntity(this.convertToDto(newEntity), HttpStatus.CREATED);
    }

    /**
     * Convert to repository t.
     *
     * @param entity the entity
     * @return the t
     */
    protected O convertToDto(final E entity) {
        return this.convertFromInstanceToClass(entity, dtoClass);
    }

    /**
     * Convert to entity e.
     *
     * @param dto the repository
     * @return the e
     */
    protected E convertToEntity(final O dto) {
        return this.convertFromInstanceToClass(dto, entityClass);
    }


    /**
     * Convert from instance to class object.
     *
     * @param <C>                the type parameter
     * @param fromObjectInstance the from object instance
     * @param toClass            the to class
     * @return the object
     */
    protected <C extends Object> C convertFromInstanceToClass(final Object fromObjectInstance, final Class<C> toClass) {
        return modelMapper.map(fromObjectInstance, toClass);
    }

    /**
     * Convert to repository collection.
     *
     * @param entityCollection the entity list
     * @return the collection
     */
    protected Collection<O> convertToDto(final Collection<E> entityCollection) {
        return entityCollection.stream()
                .map(entity -> convertToDto(entity)).collect(Collectors.toList());
    }

    /**
     * Convert to entity collection.
     *
     * @param dtoList the repository list
     * @return the collection
     */
    protected Collection<E> convertToEntity(final Collection<O> dtoList) {
        return dtoList.stream()
                .map(dto -> convertToEntity(dto)).collect(Collectors.toList());
    }

    /**
     * Gets manager.
     *
     * @return the manager
     */
    public M getManager() {
        return manager;
    }
}
