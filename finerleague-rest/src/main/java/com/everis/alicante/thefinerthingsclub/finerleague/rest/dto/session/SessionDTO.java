package com.everis.alicante.thefinerthingsclub.finerleague.rest.dto.session;

import com.everis.alicante.thefinerthingsclub.finerleague.rest.dto.ControllerObjectDTO;

import java.io.Serializable;
import java.util.Date;

/**
 * The type Session dto.
 */
public class SessionDTO implements ControllerObjectDTO {

    private static final long serialVersionUID = 8716458047553060753L;

    private String token;

    private Date expiration;

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
     * Gets expiration.
     *
     * @return the expiration
     */
    public Date getExpiration() {
        return expiration;
    }

    /**
     * Sets expiration.
     *
     * @param expiration the expiration
     */
    public void setExpiration(Date expiration) {
        this.expiration = expiration;
    }
}
