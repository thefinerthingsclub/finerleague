package com.everis.alicante.thefinerthingsclub.finerleague.rest.controller.entity.behaviour;

import com.everis.alicante.thefinerthingsclub.finerleague.core.manager.AbstractManager;
import com.everis.alicante.thefinerthingsclub.finerleague.data.entity.EntityDocument;
import com.everis.alicante.thefinerthingsclub.finerleague.rest.dto.ControllerObjectDTO;

import java.io.Serializable;

/**
 * The interface All behaviour.
 *
 * @param <M>  the manager type
 * @param <O>  the DTO type
 * @param <E>  the entity type
 * @param <ID> the id type
 */
public interface AllBehaviour<M extends AbstractManager, O extends ControllerObjectDTO, E extends EntityDocument, ID extends Serializable> extends DeletableBehaviour<M, O, E, ID>, SaveableBehaviour<M, O, E, ID>, FindableBehaviour<M, O, E, ID> {
}
