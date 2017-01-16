package com.everis.alicante.thefinerthingsclub.finerleague.rest.dto.repository;

import com.everis.alicante.thefinerthingsclub.finerleague.rest.dto.ControllerObjectDTO;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type Team dto.
 */
public class TeamDTO implements ControllerObjectDTO {

    private static final long serialVersionUID = -619125399420154253L;

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private String id;

    @JsonProperty(required = true)
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
