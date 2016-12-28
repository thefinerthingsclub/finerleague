package com.everis.alicante.thefinerthingsclub.finerleague.core.manager;

import com.everis.alicante.thefinerthingsclub.finerleague.data.dao.TeamRepository;
import com.everis.alicante.thefinerthingsclub.finerleague.data.entity.Person;
import com.everis.alicante.thefinerthingsclub.finerleague.data.entity.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * The type Person manager.
 */
@Service
public class TeamManager {

    @Autowired
    private TeamRepository teamRepository;

    /**
     * Find all list.
     *
     * @return the list
     */
    public List<Team> findAll() {
        return teamRepository.findAll();
    }

    /**
     * Find one Team.
     *
     * @param id the id
     * @return the person
     */
    public Team findOne(final String id) {
        return teamRepository.findOne(id);

    }

    /**
     * Exists boolean.
     *
     * @param id the id
     * @return the boolean
     */
    public boolean exists(final String id) {
        return teamRepository.exists(id);
    }

    /**
     * Delete.
     *
     * @param id the id
     */
    public void delete(final String id) {
        teamRepository.delete(id);
    }

    /**
     * Save person.
     *
     * @param team the person
     * @return the person
     */
    public Team save(final Team team) {
        return teamRepository.save(team);
    }
}
