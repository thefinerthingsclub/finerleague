package com.everis.alicante.thefinerthingsclub.finerleague.data.entity;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * The type Role.
 */
public class Role implements EntityDocument {

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
