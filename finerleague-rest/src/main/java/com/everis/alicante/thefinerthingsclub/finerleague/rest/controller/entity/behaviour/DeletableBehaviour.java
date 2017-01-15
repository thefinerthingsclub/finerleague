package com.everis.alicante.thefinerthingsclub.finerleague.rest.controller.entity.behaviour;


import com.everis.alicante.thefinerthingsclub.finerleague.core.manager.AbstractManager;
import com.everis.alicante.thefinerthingsclub.finerleague.data.entity.EntityDocument;
import com.everis.alicante.thefinerthingsclub.finerleague.rest.dto.ControllerObjectDTO;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.io.Serializable;
import java.util.List;

/**
 * The interface Deletable behaviour.
 *
 * @param <M>  the manager type
 * @param <O>  the DTO type
 * @param <E>  the entity type
 * @param <ID> the id type
 */
public interface DeletableBehaviour<M extends AbstractManager, O extends ControllerObjectDTO, E extends EntityDocument, ID extends Serializable> extends ControllerGenericBehaviour<M, O, E, ID> {

    /**
     * Delete.
     *
     * @param id the id
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    default public void delete(ID id) {
        getManager().delete(id);
    }

    /**
     * Delete.
     *
     * @param idList the id list
     */
    @RequestMapping(method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    default public void delete(@RequestBody final List<ID> idList) {
        getManager().delete(idList);
    }
}
