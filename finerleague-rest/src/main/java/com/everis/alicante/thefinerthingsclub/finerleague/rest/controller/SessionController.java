package com.everis.alicante.thefinerthingsclub.finerleague.rest.controller;


import com.everis.alicante.thefinerthingsclub.finerleague.core.manager.SessionManager;
import com.everis.alicante.thefinerthingsclub.finerleague.rest.dto.session.LoginDTO;
import com.everis.alicante.thefinerthingsclub.finerleague.rest.dto.session.SessionDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * The type Session controller.
 */
@RestController
@RequestMapping(value = "/session")
public class SessionController {

    @Autowired
    private SessionManager sessionManager;

    /**
     * Save response entity.
     *
     * @param login the login
     * @return the response entity
     */
    @RequestMapping(method = RequestMethod.POST, value = "/login")
    @ResponseBody
    public ResponseEntity<SessionDTO> save(final @RequestBody LoginDTO login) {
        //TODO: session manager should returns the session information
        sessionManager.login(login.getLogin(), login.getPassword());
        SessionDTO sessionDTO = new SessionDTO();
        return new ResponseEntity<SessionDTO>(sessionDTO, HttpStatus.CREATED);
    }


    /**
     * Logout.
     *
     * @param token the token
     */
    @RequestMapping(method = RequestMethod.POST, value = "/logout")
    @ResponseStatus(HttpStatus.OK)
    public void logout(@RequestHeader(value = "token") String token) {
        sessionManager.logout(token);
    }

    /**
     * Gets session.
     *
     * @param token the token
     * @return the session
     */
    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<SessionDTO> getSession(@RequestHeader(value = "token") String token) {
        //TODO: session manager should returns the session information
        sessionManager.getSession(token);
        SessionDTO sessionDTO = new SessionDTO();
        return new ResponseEntity<SessionDTO>(sessionDTO, HttpStatus.CREATED);

    }
}
