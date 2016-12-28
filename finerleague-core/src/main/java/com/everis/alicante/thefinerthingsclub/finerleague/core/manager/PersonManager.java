package com.everis.alicante.thefinerthingsclub.finerleague.core.manager;

import com.everis.alicante.thefinerthingsclub.finerleague.data.dao.PersonRepository;
import com.everis.alicante.thefinerthingsclub.finerleague.data.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * The type Person manager.
 */
@Service
public class PersonManager {

    @Autowired
    private PersonRepository personRepository;

    /**
     * Find all list.
     *
     * @return the list
     */
    public List<Person> findAll() {
        return personRepository.findAll();
    }

    /**
     * Find one person.
     *
     * @param id the id
     * @return the person
     */
    public Person findOne(final String id) {
        return personRepository.findOne(id);

    }

    /**
     * Exists boolean.
     *
     * @param id the id
     * @return the boolean
     */
    public boolean exists(final String id) {
        return personRepository.exists(id);
    }

    /**
     * Delete.
     *
     * @param id the id
     */
    public void delete(final String id) {
        personRepository.delete(id);
    }

    /**
     * Save person.
     *
     * @param person the person
     * @return the person
     */
    public Person save(final Person person) {
        return personRepository.save(person);
    }
}
