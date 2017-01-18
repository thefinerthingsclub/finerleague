package com.everis.alicante.thefinerthingsclub.finerleague.core.manager;

import com.everis.alicante.thefinerthingsclub.finerleague.data.entity.Session;
import com.everis.alicante.thefinerthingsclub.finerleague.data.repository.SessionRepository;
import com.everis.alicante.thefinerthingsclub.finerleague.external.services.ldap.LdapAuthentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import java.util.Base64;
import java.util.Calendar;
import java.util.Date;
import java.util.Optional;

/**
 * The type Session manager.
 */
@Service
public class SessionManager extends AbstractManager<SessionRepository, Session, String> {

    private final Integer EXPIRATION_DATE = 20;

    @Autowired
    private LdapAuthentication ldapAuthentication;

    /**
     * Instantiates a new Session manager.
     *
     * @param repository the repository
     */
    @Autowired
    public SessionManager(final SessionRepository repository) {
        super(repository);
    }


    /**
     * Login.
     *
     * @param login    the login
     * @param password the password
     */
    public Session login(final String login, final String password) {
        if (this.isValidAuthentication(login, password)) {
            final Session session = new Session();
            session.setLogin(login);
            session.setToken(this.generateToken(login));
            session.setExperioationDate(this.getExpirationDate());
            session.setValid(true);

            return super.getRepository().save(session);
        } else {
            throw new RuntimeException("The login is not valid.");
        }
    }

    /**
     * Logout.
     *
     * @param token the token
     */
    public void logout(final String token) {
        final Session session = super.findOne(token);
        Optional.ofNullable(session).ifPresent(s -> {
            s.setValid(false);
            super.save(s);
        });
    }

    /**
     * Gets session.
     *
     * @param token the token
     * @return the session
     */
    public Session getSession(final String token) {
        return super.getRepository().getSession(token, true);
    }

    private boolean isValidAuthentication(final String login, final String password) {
        ldapAuthentication.autenticate(login, password);
        //TODO
        return true;
    }

    private Date getExpirationDate() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.add(Calendar.MINUTE, EXPIRATION_DATE);
        return calendar.getTime();
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
