package com.everis.alicante.thefinerthingsclub.finerleague.core.manager;

import com.everis.alicante.thefinerthingsclub.finerleague.data.entity.Division;
import com.everis.alicante.thefinerthingsclub.finerleague.data.repository.DivisionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
     */
    public void getSession(final String token) {

    }
}
