package com.everis.alicante.thefinerthingsclub.finerleague.rest.controller.entity.behaviour;

import com.everis.alicante.thefinerthingsclub.finerleague.core.manager.AbstractManager;
import com.everis.alicante.thefinerthingsclub.finerleague.data.entity.EntityDocument;
import com.everis.alicante.thefinerthingsclub.finerleague.rest.dto.ControllerObjectDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;

/**
 * The interface Saveable behaviour.
 *
 * @param <M>  the manager type
 * @param <O>  the DTO type
 * @param <E>  the entity type
 * @param <ID> the id type
 */
public interface SaveableBehaviour<M extends AbstractManager, O extends ControllerObjectDTO, E extends EntityDocument, ID extends Serializable> extends ControllerGenericBehaviour<M, O, E, ID> {

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
    default public ResponseEntity<O> save(final @RequestBody O dto) throws InvocationTargetException, IllegalAccessException {
        final E newEntity = (E) getManager().save(this.convertToEntity(dto));
        return new ResponseEntity(this.convertToDto(newEntity), HttpStatus.CREATED);
    }


}
