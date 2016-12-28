package com.everis.alicante.thefinerthingsclub.finerleague.rest.controller;

import com.everis.alicante.thefinerthingsclub.finerleague.core.manager.TeamManager;
import com.everis.alicante.thefinerthingsclub.finerleague.data.entity.Team;
import com.everis.alicante.thefinerthingsclub.finerleague.rest.repository.TeamDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * The type Person controller.
 */
@RestController
@RequestMapping("/team")
public class TeamController extends AbstractController<TeamDTO, Team> {

    @Autowired
    private TeamManager teamManager;

    /**
     * Instantiates a new Team controller.
     */
    protected TeamController() { super(TeamDTO.class, Team.class);}


}
