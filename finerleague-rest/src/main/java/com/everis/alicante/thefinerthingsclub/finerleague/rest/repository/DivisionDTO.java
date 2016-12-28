package com.everis.alicante.thefinerthingsclub.finerleague.rest.repository;

import java.io.Serializable;

/**
 * The type Division repository.
 */
public class DivisionDTO implements Serializable {

    private static final long serialVersionUID = -619125399420154250L;

    private String id;

    private String name;

    private Integer priority;

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
     * Gets priority.
     *
     * @return the priority
     */
    public Integer getPriority() {
        return priority;
    }

    /**
     * Sets priority.
     *
     * @param priority the priority
     */
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "DivisionDTO{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", priority=" + priority +
                '}';
    }
}
