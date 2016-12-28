package com.everis.alicante.thefinerthingsclub.finerleague.rest.repository;

import java.io.Serializable;

/**
 * The type Division repository.
 */
public class TeamDTO implements Serializable {

    private static final long serialVersionUID = -619125399420154253L;

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

    @Override
    public String toString() {
        return "TeamDTO{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
