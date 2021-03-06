package com.everis.alicante.thefinerthingsclub.finerleague.data.entity;

import com.everis.alicante.thefinerthingsclub.finerleague.common.domain.constants.ApplicationRoleEnum;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.ReadOnlyProperty;

import java.util.List;

/**
 * The type Role.
 */
public class Role implements EntityDocument {

    @Id
    @ReadOnlyProperty
    private String id;

    private ApplicationRoleEnum role;

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
        return "Role{" +
                "id='" + id + '\'' +
                ", role='" + role.name() + '\'' +
                ", persons=" + persons +
                '}';
    }
}
