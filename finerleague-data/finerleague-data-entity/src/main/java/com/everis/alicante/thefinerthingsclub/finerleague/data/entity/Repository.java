package com.everis.alicante.thefinerthingsclub.finerleague.data.entity;

import org.springframework.data.annotation.Id;

/**
 * The type Repository.
 */
public class Repository implements EntityDocument {

    @Id
    private String id;

    private String name;

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
}
