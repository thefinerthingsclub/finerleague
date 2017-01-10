package com.everis.alicante.thefinerthingsclub.finerleague.data.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.ReadOnlyProperty;
import org.springframework.data.mongodb.core.mapping.DBRef;

/**
 * The type Person.
 */
public class Person implements EntityDocument {

    @Id
    @ReadOnlyProperty
    private String id;

    private String name;

    private String email;

    @DBRef
    private Iterable<Team> teams;

    @DBRef
    private Iterable<Role> roles;

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
     * Gets roles.
     *
     * @return the roles
     */
    public Iterable<Role> getRoles() {
        return roles;
    }

    /**
     * Sets roles.
     *
     * @param roles the roles
     */
    public void setRoles(Iterable<Role> roles) {
        this.roles = roles;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", teams=" + teams +
                ", roles=" + roles +
                '}';
    }
}
