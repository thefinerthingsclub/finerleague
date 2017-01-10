package com.everis.alicante.thefinerthingsclub.finerleague.data.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * The type Team.
 */
public class Team implements EntityDocument {

    @Id
    private String id;

    private String name;

    @DBRef
    private Iterable<Team> teams;

    @DBRef
    private Iterable<Person> persons;

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
    public Iterable<Team> getTeams() {
        return teams;
    }

    /**
     * Sets teams.
     *
     * @param teams the teams
     */
    public void setTeams(Iterable<Team> teams) {
        this.teams = teams;
    }

    /**
     * Gets persons.
     *
     * @return the persons
     */
    public Iterable<Person> getPersons() {
        return persons;
    }

    /**
     * Sets persons.
     *
     * @param persons the persons
     */
    public void setPersons(Iterable<Person> persons) {
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
