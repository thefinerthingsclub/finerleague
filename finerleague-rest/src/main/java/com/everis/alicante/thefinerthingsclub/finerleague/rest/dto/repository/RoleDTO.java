package com.everis.alicante.thefinerthingsclub.finerleague.rest.dto.repository;

import com.everis.alicante.thefinerthingsclub.finerleague.common.domain.constants.ApplicationRoleEnum;
import com.everis.alicante.thefinerthingsclub.finerleague.rest.dto.ControllerObjectDTO;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type RoleDTO.
 */
public class RoleDTO implements ControllerObjectDTO {

    private static final long serialVersionUID = -1103716465543839123L;

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private String id;

    private ApplicationRoleEnum role;

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
    public ApplicationRoleEnum getRole() {
        return role;
    }

    /**
     * Sets role.
     *
     * @param role the role
     */
    public void setRole(ApplicationRoleEnum role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "RoleDTO{" +
                "id='" + id + '\'' +
                ", role='" + role.name() + '\'' +
                '}';
    }
}
