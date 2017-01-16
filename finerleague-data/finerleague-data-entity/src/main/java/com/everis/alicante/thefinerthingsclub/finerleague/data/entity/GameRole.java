package com.everis.alicante.thefinerthingsclub.finerleague.data.entity;

import com.everis.alicante.thefinerthingsclub.finerleague.common.domain.constants.GameRoleEnum;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.ReadOnlyProperty;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.util.List;

/**
 * The type Game role enum.
 */
public class GameRole implements EntityDocument {

    @Id
    @ReadOnlyProperty
    private String id;

    @DBRef
    private Game game;

    private GameRoleEnum role;

    @DBRef
    private List<Person> persons;

    /**
     * Gets id.
     *
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Gets game.
     *
     * @return the game
     */
    public Game getGame() {
        return game;
    }

    /**
     * Sets game.
     *
     * @param game the game
     */
    public void setGame(Game game) {
        this.game = game;
    }

    /**
     * Gets role.
     *
     * @return the role
     */
    public GameRoleEnum getRole() {
        return role;
    }

    /**
     * Sets role.
     *
     * @param role the role
     */
    public void setRole(GameRoleEnum role) {
        this.role = role;
    }

    /**
     * Gets persons.
     *
     * @return the persons
     */
    public List<Person> getPersons() {
        return persons;
    }

    /**
     * Sets persons.
     *
     * @param persons the persons
     */
    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }

    @Override
    public String toString() {
        return "GameRole{" +
                "id='" + id + '\'' +
                ", game=" + game +
                ", role=" + role +
                ", persons=" + persons +
                '}';
    }
}
