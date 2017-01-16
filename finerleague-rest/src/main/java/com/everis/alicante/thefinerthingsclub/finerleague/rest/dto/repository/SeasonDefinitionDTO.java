package com.everis.alicante.thefinerthingsclub.finerleague.rest.dto.repository;

import com.everis.alicante.thefinerthingsclub.finerleague.rest.dto.ControllerObjectDTO;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

/**
 * The type SeasonDTO definition.
 */
public class SeasonDefinitionDTO implements ControllerObjectDTO {

    private static final long serialVersionUID = -167679632223519301L;

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private String id;

    private Date firstDate;

    private String seasonCycle;

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
     * Gets first date.
     *
     * @return the first date
     */
    public Date getFirstDate() {
        return firstDate;
    }

    /**
     * Sets first date.
     *
     * @param firstDate the first date
     */
    public void setFirstDate(Date firstDate) {
        this.firstDate = firstDate;
    }

    /**
     * Gets season cycle.
     *
     * @return the season cycle
     */
    public String getSeasonCycle() {
        return seasonCycle;
    }

    /**
     * Sets season cycle.
     *
     * @param seasonCycle the season cycle
     */
    public void setSeasonCycle(String seasonCycle) {
        this.seasonCycle = seasonCycle;
    }

    @Override
    public String toString() {
        return "SeasonDefinitionDTO{" +
                "id='" + id + '\'' +
                ", firstDate=" + firstDate +
                ", seasonCycle='" + seasonCycle + '\'' +
                '}';
    }
}
