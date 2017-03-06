package com.everis.alicante.thefinerthingsclub.finerleague.external.services.ldap;

import com.everis.alicante.thefinerthingsclub.finerleague.external.services.ldap.model.UserDTO;

/**
 * The interface Ldap authentication.
 */
public interface LdapAuthentication {

    /**
     * Autenticate user dto.
     *
     * @param user     the user
     * @param password the password
     * @return the user dto
     */
    UserDTO autenticate(String user, String password);
}
