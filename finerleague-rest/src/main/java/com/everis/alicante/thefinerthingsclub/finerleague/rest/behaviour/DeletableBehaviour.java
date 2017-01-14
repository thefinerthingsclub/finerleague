package com.everis.alicante.thefinerthingsclub.finerleague.rest.behaviour;


import com.everis.alicante.thefinerthingsclub.finerleague.core.manager.AbstractManager;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.io.Serializable;

/**
 * The interface DeletableBehaviour.
 *
 * @param <ID> the type parameter
 * @param <M>  the type parameter
 */
public interface DeletableBehaviour<M extends AbstractManager, ID extends Serializable> extends ControllerGenericBehaviour<M> {

    /**
     * Delete.
     *
     * @param id the id
     */
    public void delete(ID id);
}
