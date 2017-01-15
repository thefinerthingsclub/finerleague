package com.everis.alicante.thefinerthingsclub.finerleague.rest.controller.entity.behaviour;


import com.everis.alicante.thefinerthingsclub.finerleague.core.manager.AbstractManager;
import com.everis.alicante.thefinerthingsclub.finerleague.data.entity.EntityDocument;
import com.everis.alicante.thefinerthingsclub.finerleague.rest.dto.ControllerObjectDTO;

import java.io.Serializable;
import java.util.Collection;

/**
 * The interface Controller generic behaviour.
 *
 * @param <M>  the manager type
 * @param <O>  the DTO type
 * @param <E>  the entity type
 * @param <ID> the id type
 */
public interface ControllerGenericBehaviour<M extends AbstractManager, O extends ControllerObjectDTO, E extends EntityDocument, ID extends Serializable> {

    /**
     * Gets manager.
     *
     * @return the manager
     */
    M getManager();

    /**
     * Convert to dto o.
     *
     * @param entity the entity
     * @return the o
     */
    O convertToDto(final E entity);

    /**
     * Convert to entity e.
     *
     * @param dto the dto
     * @return the e
     */
    E convertToEntity(final O dto);

    /**
     * Convert from instance to class c.
     *
     * @param <C>                the type parameter
     * @param fromObjectInstance the from object instance
     * @param toClass            the to class
     * @return the c
     */
    <C extends Object> C convertFromInstanceToClass(final Object fromObjectInstance, final Class<C> toClass);

    /**
     * Convert to dto collection.
     *
     * @param entityCollection the entity collection
     * @return the collection
     */
    Collection<O> convertToDto(final Collection<E> entityCollection);

    /**
     * Convert to entity collection.
     *
     * @param dtoList the dto list
     * @return the collection
     */
    Collection<E> convertToEntity(final Collection<O> dtoList);

}
