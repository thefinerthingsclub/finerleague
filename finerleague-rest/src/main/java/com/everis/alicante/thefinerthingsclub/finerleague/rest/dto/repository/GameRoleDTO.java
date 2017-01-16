package com.everis.alicante.thefinerthingsclub.finerleague.rest.dto.repository;

import com.everis.alicante.thefinerthingsclub.finerleague.common.domain.constants.GameRoleEnum;
import com.everis.alicante.thefinerthingsclub.finerleague.rest.dto.ControllerObjectDTO;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type Game role enum.
 */
public class GameRoleDTO implements ControllerObjectDTO {

    private static final long serialVersionUID = 6446409171844813101L;

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private String id;

    private GameRoleEnum role;

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

    @Override
    public String toString() {
        return "GameRoleDTO{" +
                "id='" + id + '\'' +
                ", role=" + role +
                '}';
    }
}
