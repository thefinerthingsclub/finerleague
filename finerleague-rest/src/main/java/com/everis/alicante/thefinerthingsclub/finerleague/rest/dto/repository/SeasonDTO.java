package com.everis.alicante.thefinerthingsclub.finerleague.rest.dto.repository;

import com.everis.alicante.thefinerthingsclub.finerleague.rest.dto.ControllerObjectDTO;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

/**
 * The type SeasonDTO.
 */
public class SeasonDTO implements ControllerObjectDTO {

    private static final long serialVersionUID = 4775129837510461911L;

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private String id;

    private String name;

    private String image;

    private Date startDate;

    private Date endDate;

    private SeasonDefinitionDTO seasonDefinition;


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
     * Gets start date.
     *
     * @return the start date
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * Sets start date.
     *
     * @param startDate the start date
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    /**
     * Gets end date.
     *
     * @return the end date
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * Sets end date.
     *
     * @param endDate the end date
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    /**
     * Gets season definition.
     *
     * @return the season definition
     */
    public SeasonDefinitionDTO getSeasonDefinition() {
        return seasonDefinition;
    }

    /**
     * Sets season definition.
     *
     * @param seasonDefinition the season definition
     */
    public void setSeasonDefinition(SeasonDefinitionDTO seasonDefinition) {
        this.seasonDefinition = seasonDefinition;
    }

    @Override
    public String toString() {
        return "SeasonDTO{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", image='" + image + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", seasonDefinition=" + seasonDefinition +
                '}';
    }
}
