package com.everis.alicante.thefinerthingsclub.finerleague.rest.controller;

import com.everis.alicante.thefinerthingsclub.finerleague.core.manager.AbstractManager;
import com.everis.alicante.thefinerthingsclub.finerleague.data.entity.EntityDocument;
import com.everis.alicante.thefinerthingsclub.finerleague.rest.dto.ControllerObjectDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * The type Abstract controller.
 *
 * @param <M>  the manager type
 * @param <O>  the DTO type
 * @param <E>  the entity type
 * @param <ID> the id type
 */
public abstract class AbstractController<M extends AbstractManager, O extends ControllerObjectDTO, E extends EntityDocument, ID extends Serializable> {

    private M manager;

    private Class<O> dtoClass;

    private Class<E> entityClass;

    @Autowired
    private ModelMapper modelMapper;

    /**
     * Instantiates a new Abstract controller.
     *
     * @param managerClass the manager class
     * @param dtoClass     the dto class
     * @param entityClass  the entity class
     */
    protected AbstractController(final M managerClass, final Class<O> dtoClass, final Class<E> entityClass) {
        this.dtoClass = dtoClass;
        this.entityClass = entityClass;
        this.manager = managerClass;
    }

    /**
     * Convert to dto o.
     *
     * @param entity the entity
     * @return the o
     */
    protected O convertToDto(final E entity) {
        return this.convertFromInstanceToClass(entity, dtoClass);
    }

    /**
     * Convert to entity e.
     *
     * @param dto the dto
     * @return the e
     */
    protected E convertToEntity(final O dto) {
        return this.convertFromInstanceToClass(dto, entityClass);
    }


    /**
     * Convert from instance to class c.
     *
     * @param <C>                the type parameter
     * @param fromObjectInstance the from object instance
     * @param toClass            the to class
     * @return the c
     */
    protected <C extends Object> C convertFromInstanceToClass(final Object fromObjectInstance, final Class<C> toClass) {
        return modelMapper.map(fromObjectInstance, toClass);
    }

    /**
     * Convert to dto collection.
     *
     * @param entityCollection the entity collection
     * @return the collection
     */
    protected Collection<O> convertToDto(final Collection<E> entityCollection) {
        return entityCollection.stream()
                .map(entity -> convertToDto(entity)).collect(Collectors.toList());
    }

    /**
     * Convert to entity collection.
     *
     * @param dtoList the dto list
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
    protected M getManager() {
        return manager;
    }
}
