package com.everis.alicante.thefinerthingsclub.finerleague.rest.aspects;

import com.everis.alicante.thefinerthingsclub.finerleague.rest.behaviour.DeletableBehaviour;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public aspect DeletableControllerBehaviourAspect {

    /**
     * Delete.
     *
     * @param id the id
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public final void DeletableBehaviour.delete(final @PathVariable(name = "id", value = "id") String id) {
        getManager().delete(id);
    }

}
