package com.everis.alicante.thefinerthingsclub.finerleague.external.services.ldap.external.services.ldap;

import com.everis.alicante.thefinerthingsclub.finerleague.external.services.ldap.LdapAuthentication;
import com.everis.alicante.thefinerthingsclub.finerleague.external.services.ldap.model.UserDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * The type Ldap authentication.
 */
@Service
public class LdapAuthenticationImpl implements LdapAuthentication {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * Init.
     */
    @PostConstruct
    public void init() {
        logger.info("Initializing the LdapAuthentication...");
    }

    @Override
    public UserDTO autenticate(final String user, final String password) {
        return new UserDTO("Pepito", "de los palotes", "pepitodelospalotes@gmail.com");
    }
}
