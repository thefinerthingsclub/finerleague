package com.everis.alicante.thefinerthingsclub.finerleague.core.manager;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import java.util.Base64;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.alicante.thefinerthingsclub.finerleague.data.entity.Division;
import com.everis.alicante.thefinerthingsclub.finerleague.data.repository.DivisionRepository;

// TODO: Auto-generated Javadoc
/**
 * The type Session manager.
 */
@Service
public class SessionManager extends AbstractManager<DivisionRepository, Division, String> {

    /**
     * Instantiates a new Session manager.
     *
     * @param repository the repository
     */
    @Autowired
    public SessionManager(final DivisionRepository repository) {
        super(repository);
    }


    /**
     * Login.
     *
     * @param login    the login
     * @param password the password
     */
    public void login(final String login, final String password) {

    }

    /**
     * Logout.
     *
     * @param token the token
     */
    public void logout(final String token) {

    }

    /**
     * Gets session.
     *
     * @param token the token
     * @return the session
     */
    public void getSession(final String token) {

    }
    
    /**
     * Generate token.
     *
     * @param login the login
     * @return the string
     */
    private String generateToken(final String login) {
    	final SecureRandom random = new SecureRandom();
    	final StringBuffer sb = new StringBuffer();
    	
    	sb.append(login);
    	sb.append(new BigInteger(130, random).toString(32));
    	byte[] toEncode = sb.toString().getBytes(StandardCharsets.UTF_8);
    	
    	return Base64.getEncoder().encodeToString(toEncode);
    }

}
