package com.everis.alicante.thefinerthingsclub.finerleague.data.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.ReadOnlyProperty;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Team.
 */
public class Team implements EntityDocument {

    @Id
    @ReadOnlyProperty
    private String id;

    private String name;

    @DBRef
    private List<Team> teams;

    @DBRef
    private List<Person> persons;

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
    public List<Team> getTeams() {
        if (teams == null) {
            teams = new ArrayList<>();
        }
        return teams;
    }

    /**
     * Sets teams.
     *
     * @param teams the teams
     */
    public void setTeams(List<Team> teams) {
        this.teams = teams;
    }

    /**
     * Gets persons.
     *
     * @return the persons
     */
    public List<Person> getPersons() {
        if (persons == null) {
            persons = new ArrayList<>();
        }
        return persons;
    }

    /**
     * Sets persons.
     *
     * @param persons the persons
     */
    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }

    @Override
    public String toString() {
        return "Team{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", teams=" + teams +
                ", persons=" + persons +
                '}';
    }
}
