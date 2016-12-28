package com.everis.alicante.thefinerthingsclub.finerleague.rest.controller;

import com.everis.alicante.thefinerthingsclub.finerleague.data.entity.EntityDocument;
import com.everis.alicante.thefinerthingsclub.finerleague.rest.dto.ControllerDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collection;
import java.util.stream.Collectors;

/**
 * The type Abstract controller.
 *
 * @param <T> the DTO Type parameter
 * @param <E> the Entity Type parameter
 */
public class AbstractController<T extends ControllerDTO, E extends EntityDocument> {

    private Class<T> dtoClass;

    private Class<E> entityClass;

    @Autowired
    private ModelMapper modelMapper;

    /**
     * Instantiates a new Abstract controller.
     *
     * @param dtoClass    the dto class
     * @param entityClass the entity class
     */
    protected AbstractController(final Class<T> dtoClass, final Class<E> entityClass) {
        this.dtoClass = dtoClass;
        this.entityClass = entityClass;
    }

    /**
     * Convert to dto t.
     *
     * @param entity the entity
     * @return the t
     */
    protected T convertToDto(final E entity) {
        return this.convertFromInstanceToClass(entity, dtoClass);
    }

    /**
     * Convert to entity e.
     *
     * @param dto the dto
     * @return the e
     */
    protected E convertToEntity(final T dto) {
        return this.convertFromInstanceToClass(dto, entityClass);
    }


    /**
     * Convert from instance to class object.
     *
     * @param fromObjectInstance the from object instance
     * @param toClass            the to class
     * @return the object
     */
    protected <C extends Object> C convertFromInstanceToClass(final Object fromObjectInstance, final Class<C> toClass) {
        return modelMapper.map(fromObjectInstance, toClass);
    }

    /**
     * Convert to dto collection.
     *
     * @param entityCollection the entity list
     * @return the collection
     */
    protected Collection<T> convertToDto(final Collection<E> entityCollection) {
        return entityCollection.stream()
                .map(entity -> convertToDto(entity)).collect(Collectors.toList());
    }

    /**
     * Convert to entity collection.
     *
     * @param dtoList the dto list
     * @return the collection
     */
    protected Collection<E> convertToEntity(final Collection<T> dtoList) {
        return dtoList.stream()
                .map(dto -> convertToEntity(dto)).collect(Collectors.toList());
    }

}