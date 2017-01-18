package com.everis.alicante.thefinerthingsclub.finerleague.rest.controller.entity;


import com.everis.alicante.thefinerthingsclub.finerleague.core.manager.SessionManager;
import com.everis.alicante.thefinerthingsclub.finerleague.data.entity.Session;
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
public class SessionController extends AbstractController<SessionManager, SessionDTO, Session, String>{

    @Autowired
    public SessionController(final SessionManager sessionManager){
        super(sessionManager, SessionDTO.class, Session.class);
    }


    /**
     * Save response entity.
     *
     * @param login the login
     * @return the response entity
     */
    @RequestMapping(method = RequestMethod.POST, value = "/login")
    @ResponseBody
    public ResponseEntity<SessionDTO> save(final @RequestBody LoginDTO login) {
        final Session session = super.getManager().login(login.getLogin(), login.getPassword());
        return new ResponseEntity<SessionDTO>(super.convertToDto(session), HttpStatus.CREATED);
    }


    /**
     * Logout.
     *
     * @param token the token
     */
    @RequestMapping(method = RequestMethod.POST, value = "/logout")
    @ResponseStatus(HttpStatus.OK)
    public void logout(@RequestHeader(value = "token") String token) {
        super.getManager().logout(token);
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
        final Session session =  super.getManager().getSession(token);
        return new ResponseEntity<SessionDTO>(super.convertToDto(session), HttpStatus.CREATED);

    }
}
