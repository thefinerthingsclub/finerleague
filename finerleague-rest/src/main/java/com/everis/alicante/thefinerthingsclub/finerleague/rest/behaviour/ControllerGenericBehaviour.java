package com.everis.alicante.thefinerthingsclub.finerleague.rest.behaviour;


import com.everis.alicante.thefinerthingsclub.finerleague.core.manager.AbstractManager;

/**
 * The interface Controller generic behaviour.
 *
 * @param <M> the type parameter
 */
public interface ControllerGenericBehaviour<M extends AbstractManager> {

    /**
     * Gets manager.
     *
     * @return the manager
     */
    public M getManager();

}
