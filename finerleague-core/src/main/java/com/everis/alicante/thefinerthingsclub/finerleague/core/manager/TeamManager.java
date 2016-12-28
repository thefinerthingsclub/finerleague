package com.everis.alicante.thefinerthingsclub.finerleague.core.manager;

import com.everis.alicante.thefinerthingsclub.finerleague.data.repository.TeamRepository;
import com.everis.alicante.thefinerthingsclub.finerleague.data.entity.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * The type Team manager.
 */
@Service
public class TeamManager extends AbstractManager<TeamRepository, Team, String> {

    /**
     * Instantiates a new Team manager.
     *
     * @param repository the repository
     */
    @Autowired
    public TeamManager(final TeamRepository repository) {
        super(repository);
    }
}
