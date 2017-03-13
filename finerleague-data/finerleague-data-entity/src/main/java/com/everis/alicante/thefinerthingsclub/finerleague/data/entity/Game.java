package com.everis.alicante.thefinerthingsclub.finerleague.data.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.ReadOnlyProperty;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

/**
 * The type Game.
 */
@Document(collection = "game")
public class Game implements EntityDocument {

    @Id
    @ReadOnlyProperty
    private String id;

    private String name;

    private String image;

    @DBRef
    private SeasonDefinition seasonDefinition;

    @DBRef
    private List<Repository> repositories;

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
     * Gets image.
     *
     * @return the image
     */
    public String getImage() {
        return image;
    }

    /**
     * Sets image.
     *
     * @param image the image
     */
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * Gets season definition.
     *
     * @return the season definition
     */
    public SeasonDefinition getSeasonDefinition() {
        return seasonDefinition;
    }

    /**
     * Sets season definition.
     *
     * @param seasonDefinition the season definition
     */
    public void setSeasonDefinition(SeasonDefinition seasonDefinition) {
        this.seasonDefinition = seasonDefinition;
    }

    /**
     * Gets repositories.
     *
     * @return the repositories
     */
    public List<Repository> getRepositories() {
        return repositories;
    }

    /**
     * Sets repositories.
     *
     * @param repositories the repositories
     */
    public void setRepositories(List<Repository> repositories) {
        this.repositories = repositories;
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
        return "Game{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", image='" + image + '\'' +
                ", seasonDefinition=" + seasonDefinition +
                ", repositories=" + repositories +
                ", gameRoles=" + gameRoles +
                '}';
    }
}
