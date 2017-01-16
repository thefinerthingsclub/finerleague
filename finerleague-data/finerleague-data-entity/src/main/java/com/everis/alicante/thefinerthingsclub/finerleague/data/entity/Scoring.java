package com.everis.alicante.thefinerthingsclub.finerleague.data.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.ReadOnlyProperty;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * The type Scoring.
 */
public class Scoring implements EntityDocument {

    @Id
    @ReadOnlyProperty
    private String id;

    @DBRef
    private Person person;

    @DBRef
    private SeasonDivision seasonDivision;

    @DBRef
    private Repository repository;

    private String idCommit;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private Date date;

    private Double scoring;

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
     * Gets person.
     *
     * @return the person
     */
    public Person getPerson() {
        return person;
    }

    /**
     * Sets person.
     *
     * @param person the person
     */
    public void setPerson(Person person) {
        this.person = person;
    }

    /**
     * Gets season division.
     *
     * @return the season division
     */
    public SeasonDivision getSeasonDivision() {
        return seasonDivision;
    }

    /**
     * Sets season division.
     *
     * @param seasonDivision the season division
     */
    public void setSeasonDivision(SeasonDivision seasonDivision) {
        this.seasonDivision = seasonDivision;
    }

    /**
     * Gets repository.
     *
     * @return the repository
     */
    public Repository getRepository() {
        return repository;
    }

    /**
     * Sets repository.
     *
     * @param repository the repository
     */
    public void setRepository(Repository repository) {
        this.repository = repository;
    }

    /**
     * Gets id commit.
     *
     * @return the id commit
     */
    public String getIdCommit() {
        return idCommit;
    }

    /**
     * Sets id commit.
     *
     * @param idCommit the id commit
     */
    public void setIdCommit(String idCommit) {
        this.idCommit = idCommit;
    }

    /**
     * Gets date.
     *
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * Sets date.
     *
     * @param date the date
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * Gets scoring.
     *
     * @return the scoring
     */
    public Double getScoring() {
        return scoring;
    }

    /**
     * Sets scoring.
     *
     * @param scoring the scoring
     */
    public void setScoring(Double scoring) {
        this.scoring = scoring;
    }

    @Override
    public String toString() {
        return "Scoring{" +
                "id='" + id + '\'' +
                ", person=" + person +
                ", seasonDivision=" + seasonDivision +
                ", repository=" + repository +
                ", idCommit='" + idCommit + '\'' +
                ", date=" + date +
                ", scoring=" + scoring +
                '}';
    }
}
