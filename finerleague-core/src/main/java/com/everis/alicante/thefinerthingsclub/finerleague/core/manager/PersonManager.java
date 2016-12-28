package com.everis.alicante.thefinerthingsclub.finerleague.core.manager;

import com.everis.alicante.thefinerthingsclub.finerleague.data.repository.PersonRepository;
import com.everis.alicante.thefinerthingsclub.finerleague.data.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * The type Person manager.
 */
@Service
public class PersonManager extends AbstractManager<PersonRepository, Person, String> {

    /**
     * Instantiates a new Person manager.
     *
     * @param repository the repository
     */
    @Autowired
    public PersonManager(PersonRepository repository) {
        super(repository);
    }
}
