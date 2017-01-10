package com.everis.alicante.thefinerthingsclub.finerleague.rest.repository;

import com.everis.alicante.thefinerthingsclub.finerleague.rest.dto.ControllerObjectDTO;

import java.util.List;

/**
 * The type Division repository.
 */
public class TeamDTO implements ControllerObjectDTO {

    private static final long serialVersionUID = -619125399420154253L;

    private String id;

    private String name;

    private List<TeamDTO> teams;

    private List<PersonDTO> persons;

    /**
     * Gets id.
     *
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets teams.
     *
     * @return the teams
     */
    public List<TeamDTO> getTeams() {
        return teams;
    }

    /**
     * Sets teams.
     *
     * @param teams the teams
     */
    public void setTeams(List<TeamDTO> teams) {
        this.teams = teams;
    }

    /**
     * Gets persons.
     *
     * @return the persons
     */
    public List<PersonDTO> getPersons() {
        return persons;
    }

    /**
     * Sets persons.
     *
     * @param persons the persons
     */
    public void setPersons(List<PersonDTO> persons) {
        this.persons = persons;
    }

    @Override
    public String toString() {
        return "TeamDTO{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
