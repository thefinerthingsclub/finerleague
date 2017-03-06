package com.everis.alicante.thefinerthingsclub.finerleague.data.entity;

import org.springframework.data.annotation.Id;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * The type User session.
 */
public class Session implements EntityDocument {

    @Id
    private String token;

    private String login;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private Date experioationDate;

    private Boolean valid;


    /**
     * Gets token.
     *
     * @return the token
     */
    public String getToken() {
        return token;
    }

    /**
     * Sets token.
     *
     * @param token the token
     */
    public void setToken(String token) {
        this.token = token;
    }

    /**
     * Gets login.
     *
     * @return the login
     */
    public String getLogin() {
        return login;
    }

    /**
     * Sets login.
     *
     * @param login the login
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * Gets experioation date.
     *
     * @return the experioation date
     */
    public Date getExperioationDate() {
        return experioationDate;
    }

    /**
     * Sets experioation date.
     *
     * @param experioationDate the experioation date
     */
    public void setExperioationDate(Date experioationDate) {
        this.experioationDate = experioationDate;
    }

    /**
     * Is valid boolean.
     *
     * @return the boolean
     */
    public Boolean isValid() {
        return valid;
    }

    /**
     * Sets valid.
     *
     * @param valid the valid
     */
    public void setValid(Boolean valid) {
        this.valid = valid;
    }

    @Override
    public String toString() {
        return "Session{" +
                ", token='" + token + '\'' +
                ", login='" + login + '\'' +
                ", experioationDate=" + experioationDate +
                ", valid=" + valid +
                '}';
    }
}
