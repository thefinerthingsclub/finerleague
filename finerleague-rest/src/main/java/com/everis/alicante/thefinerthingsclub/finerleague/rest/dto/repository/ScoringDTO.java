package com.everis.alicante.thefinerthingsclub.finerleague.rest.dto.repository;

import com.everis.alicante.thefinerthingsclub.finerleague.rest.dto.ControllerObjectDTO;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

/**
 * The type ScoringDTO.
 */
public class ScoringDTO implements ControllerObjectDTO {

    private static final long serialVersionUID = -1384970026335576355L;

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private String id;

    private String idCommit;

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
        return "ScoringDTO{" +
                "id='" + id + '\'' +
                ", idCommit='" + idCommit + '\'' +
                ", date=" + date +
                ", scoring=" + scoring +
                '}';
    }
}
