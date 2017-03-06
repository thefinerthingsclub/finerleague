package com.everis.alicante.thefinerthingsclub.finerleague.rest.dto.session;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * The type Login dto.
 */
public class LoginDTO implements Serializable {

    private static final long serialVersionUID = 1689025739813571192L;

    @JsonProperty(required = true)
    private String login;

    @JsonProperty(required = true)
    private String password;

    /**
     * Gets user name.
     *
     * @return the user name
     */
    public String getLogin() {
        return login;
    }

    /**
     * Sets user name.
     *
     * @param login the user name
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * Gets password.
     *
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets password.
     *
     * @param password the password
     */
    public void setPassword(String password) {
        this.password = password;
    }
}
