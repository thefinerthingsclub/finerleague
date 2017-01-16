package com.everis.alicante.thefinerthingsclub.finerleague.data.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.ReadOnlyProperty;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.util.List;

/**
 * The type Season division.
 */
public class SeasonDivision implements EntityDocument {

    @Id
    @ReadOnlyProperty
    private String id;

    @DBRef
    private Season season;

    @DBRef
    private Division division;

    @DBRef
    private List<Person> personList;

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
     * Gets season.
     *
     * @return the season
     */
    public Season getSeason() {
        return season;
    }

    /**
     * Sets season.
     *
     * @param season the season
     */
    public void setSeason(Season season) {
        this.season = season;
    }

    /**
     * Gets division.
     *
     * @return the division
     */
    public Division getDivision() {
        return division;
    }

    /**
     * Sets division.
     *
     * @param division the division
     */
    public void setDivision(Division division) {
        this.division = division;
    }

    /**
     * Gets person list.
     *
     * @return the person list
     */
    public List<Person> getPersonList() {
        return personList;
    }

    /**
     * Sets person list.
     *
     * @param personList the person list
     */
    public void setPersonList(List<Person> personList) {
        this.personList = personList;
    }

    @Override
    public String toString() {
        return "SeasonDivision{" +
                "id='" + id + '\'' +
                ", season=" + season +
                ", division=" + division +
                ", personList=" + personList +
                '}';
    }
}
