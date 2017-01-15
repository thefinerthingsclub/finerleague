package com.everis.alicante.thefinerthingsclub.finerleague.rest.controller.entity;

import com.everis.alicante.thefinerthingsclub.finerleague.core.manager.AbstractManager;
import com.everis.alicante.thefinerthingsclub.finerleague.data.entity.EntityDocument;
import com.everis.alicante.thefinerthingsclub.finerleague.rest.controller.entity.behaviour.ControllerGenericBehaviour;
import com.everis.alicante.thefinerthingsclub.finerleague.rest.dto.ControllerObjectDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.util.Collection;
import java.util.stream.Collectors;

/**
 * The type Abstract controller.
 *
 * @param <M>  the manager type
 * @param <O>  the DTO type
 * @param <E>  the entity type
 * @param <ID> the id type
 */
public abstract class AbstractController<M extends AbstractManager, O extends ControllerObjectDTO, E extends EntityDocument, ID extends Serializable> implements ControllerGenericBehaviour<M, O, E, ID> {

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

    @Override
    public O convertToDto(final E entity) {
        return this.convertFromInstanceToClass(entity, dtoClass);
    }

    @Override
    public E convertToEntity(final O dto) {
        return this.convertFromInstanceToClass(dto, entityClass);
    }


    @Override
    public <C extends Object> C convertFromInstanceToClass(final Object fromObjectInstance, final Class<C> toClass) {
        return modelMapper.map(fromObjectInstance, toClass);
    }

    @Override
    public Collection<O> convertToDto(final Collection<E> entityCollection) {
        return entityCollection.stream()
                .map(entity -> convertToDto(entity)).collect(Collectors.toList());
    }

    @Override
    public Collection<E> convertToEntity(final Collection<O> dtoList) {
        return dtoList.stream()
                .map(dto -> convertToEntity(dto)).collect(Collectors.toList());
    }

    @Override
    public M getManager() {
        return manager;
    }
}
