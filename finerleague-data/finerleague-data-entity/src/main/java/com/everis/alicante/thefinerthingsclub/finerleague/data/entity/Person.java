package com.everis.alicante.thefinerthingsclub.finerleague.data.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.ReadOnlyProperty;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.util.List;

/**
 * The type Person.
 */
public class Person implements EntityDocument {

    @Id
    @ReadOnlyProperty
    private String id;

    private String identifier;

    private String name;

    private String email;

    @DBRef
    private List<Team> teams;

    @DBRef
    private List<Role> roles;

    @DBRef
    private List<SeasonDivision> seasonDivisionList;

    @DBRef
    private List<GameRole> gameRoles;

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
     * Gets identifier.
     *
     * @return the identifier
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Sets identifier.
     *
     * @param identifier the identifier
     */
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
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
     * Gets email.
     *
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets email.
     *
     * @param email the email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Gets teams.
     *
     * @return the teams
     */
    public List<Team> getTeams() {
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
     * Gets roles.
     *
     * @return the roles
     */
    public List<Role> getRoles() {
        return roles;
    }

    /**
     * Sets roles.
     *
     * @param roles the roles
     */
    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    /**
     * Gets season division list.
     *
     * @return the season division list
     */
    public List<SeasonDivision> getSeasonDivisionList() {
        return seasonDivisionList;
    }

    /**
     * Sets season division list.
     *
     * @param seasonDivisionList the season division list
     */
    public void setSeasonDivisionList(List<SeasonDivision> seasonDivisionList) {
        this.seasonDivisionList = seasonDivisionList;
    }

    /**
     * Gets game roles.
     *
     * @return the game roles
     */
    public List<GameRole> getGameRoles() {
        return gameRoles;
    }

    /**
     * Sets game roles.
     *
     * @param gameRoles the game roles
     */
    public void setGameRoles(List<GameRole> gameRoles) {
        this.gameRoles = gameRoles;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                "identifier='" + identifier + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", teams=" + teams +
                ", roles=" + roles +
                ", seasonDivisionList=" + seasonDivisionList +
                ", gameRoles=" + gameRoles +
                '}';
    }
}
