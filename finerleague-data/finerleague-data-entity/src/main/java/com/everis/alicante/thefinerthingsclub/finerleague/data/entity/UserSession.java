package com.everis.alicante.thefinerthingsclub.finerleague.data.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * The type User session.
 */
public class UserSession implements EntityDocument {

    private String session;

    private String token;

    private String login;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)

    private Date experioationDate;

    private boolean valid;

    /**
     * Gets session.
     *
     * @return the session
     */
    public String getSession() {
        return session;
    }

    /**
     * Sets session.
     *
     * @param session the session
     */
    public void setSession(String session) {
        this.session = session;
    }

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
    public boolean isValid() {
        return valid;
    }

    /**
     * Sets valid.
     *
     * @param valid the valid
     */
    public void setValid(boolean valid) {
        this.valid = valid;
    }

    @Override
    public String toString() {
        return "UserSession{" +
                "session='" + session + '\'' +
                ", token='" + token + '\'' +
                ", login='" + login + '\'' +
                ", experioationDate=" + experioationDate +
                ", valid=" + valid +
                '}';
    }
}
