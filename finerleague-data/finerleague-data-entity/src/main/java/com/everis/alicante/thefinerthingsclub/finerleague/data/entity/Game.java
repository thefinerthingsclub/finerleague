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

    private Iterable<Repository> repositories;

}
