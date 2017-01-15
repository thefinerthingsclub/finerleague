package com.everis.alicante.thefinerthingsclub.finerleague.rest.controller.entity;

import com.everis.alicante.thefinerthingsclub.finerleague.core.manager.TeamManager;
import com.everis.alicante.thefinerthingsclub.finerleague.data.entity.Team;
import com.everis.alicante.thefinerthingsclub.finerleague.rest.controller.entity.behaviour.AllBehaviour;
import com.everis.alicante.thefinerthingsclub.finerleague.rest.dto.repository.TeamDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.InvocationTargetException;
import java.util.List;


/**
 * The type Person controller.
 */
@RestController
@RequestMapping("/team")
public class TeamController extends AbstractController<TeamManager, TeamDTO, Team, String> implements AllBehaviour<TeamManager, TeamDTO, Team, String> {

    /**
     * Instantiates a new Team controller.
     *
     * @param teamManager the team manager
     */
    @Autowired
    public TeamController(final TeamManager teamManager) {
        super(teamManager, TeamDTO.class, Team.class);
    }

    /**
     * Relate teams response entity.
     *
     * @param idParent   the id parent
     * @param teamIdList the team id list
     * @return the response entity
     * @throws InvocationTargetException the invocation target exception
     * @throws IllegalAccessException    the illegal access exception
     */
    @RequestMapping(value = "/{idParent}/teams", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<TeamDTO> relateTeams(final @PathVariable String idParent, @RequestBody final List<String> teamIdList) throws InvocationTargetException, IllegalAccessException {
        return new ResponseEntity(super.convertToDto(super.getManager().relateTeams(idParent, teamIdList)), HttpStatus.OK);
    }


    /**
     * Add persons response entity.
     *
     * @param id           the id
     * @param personIdList the person id list
     * @return the response entity
     * @throws InvocationTargetException the invocation target exception
     * @throws IllegalAccessException    the illegal access exception
     */
    @RequestMapping(value = "/{id}/persons", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<TeamDTO> relatePersons(final @PathVariable String id, @RequestBody final List<String> personIdList) throws InvocationTargetException, IllegalAccessException {
        return new ResponseEntity(super.convertToDto(super.getManager().relatePersons(id, personIdList)), HttpStatus.OK);
    }
}
