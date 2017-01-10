package com.everis.alicante.thefinerthingsclub.finerleague.core.manager;

import com.everis.alicante.thefinerthingsclub.finerleague.data.entity.Person;
import com.everis.alicante.thefinerthingsclub.finerleague.data.entity.Team;
import com.everis.alicante.thefinerthingsclub.finerleague.data.repository.PersonRepository;
import com.everis.alicante.thefinerthingsclub.finerleague.data.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * The type Team manager.
 */
@Service
public class TeamManager extends AbstractManager<TeamRepository, Team, String> {

    @Autowired
    private PersonRepository personRepository;

    /**
     * Instantiates a new Team manager.
     *
     * @param repository the repository
     */
    @Autowired
    public TeamManager(final TeamRepository repository) {
        super(repository);
    }

    /**
     * Relate teams team.
     *
     * @param idParent   the id parent
     * @param teamIdList the team id list
     * @return the team
     */
    public Team relateTeams(final String idParent, final List<String> teamIdList) {
        final Team parentTeam = super.getRepository().findOne(idParent);
        if (parentTeam == null) {
            throw new RuntimeException(String.format("The Team [%s] does not exist", idParent));
        }
        final List<Team> teams = (List) super.getRepository().findAll(teamIdList);
        parentTeam.getTeams().addAll(teams);
        super.getRepository().save(parentTeam);
        return parentTeam;
    }

    /**
     * Add persons team.
     *
     * @param idTeam       the id team
     * @param personIdList the person id list
     * @return the team
     */
    public Team relatePersons(final String idTeam, final List<String> personIdList) {
        final Team team = super.getRepository().findOne(idTeam);
        if (team == null) {
            throw new RuntimeException(String.format("The Team [%s] does not exist", idTeam));
        }
        final List<Person> personList = (List) personRepository.findAll(personIdList);
        team.getPersons().addAll(personList);
        super.getRepository().save(team);
        return team;
    }

}
