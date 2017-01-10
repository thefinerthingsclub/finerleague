package com.everis.alicante.thefinerthingsclub.finerleague.data.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * The type Game.
 */
@Document(collection = "games")
public class Game implements EntityDocument {

    @Id
    private String id;

    private String name;

    private String image;

    private Iterable<Season> seasons;

    private Iterable<Repository> repositories;

    private SeasonDefinition seasonDefinition;

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
     * Gets seasons.
     *
     * @return the seasons
     */
    public Iterable<Season> getSeasons() {
        return seasons;
    }

    /**
     * Sets seasons.
     *
     * @param seasons the seasons
     */
    public void setSeasons(Iterable<Season> seasons) {
        this.seasons = seasons;
    }

    /**
     * Gets repositories.
     *
     * @return the repositories
     */
    public Iterable<Repository> getRepositories() {
        return repositories;
    }

    /**
     * Sets repositories.
     *
     * @param repositories the repositories
     */
    public void setRepositories(Iterable<Repository> repositories) {
        this.repositories = repositories;
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

    @Override
    public String toString() {
        return "Game{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", image='" + image + '\'' +
                ", seasons=" + seasons +
                ", repositories=" + repositories +
                ", seasonDefinition=" + seasonDefinition +
                '}';
    }
}
