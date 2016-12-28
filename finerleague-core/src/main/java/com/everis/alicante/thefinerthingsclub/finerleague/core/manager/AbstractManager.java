package com.everis.alicante.thefinerthingsclub.finerleague.core.manager;

import com.everis.alicante.thefinerthingsclub.finerleague.data.entity.Division;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public class AbstractManager<T extends MongoRepository, E extends > {

    private T repository;

    protected AbstractManager(final T repository) {
        this.repository = repository;
    }

    /**
     * Find all list.
     *
     * @return the list
     */
    public List<Division> findAll() {
        return repository.findAll();
    }

    /**
     * Find one division.
     *
     * @param id the id
     * @return the division
     */
    public Division findOne(final String id) {
        return repository.findOne(id);

    }

    /**
     * Exists boolean.
     *
     * @param id the id
     * @return the boolean
     */
    public boolean exists(final String id) {
        return repository.exists(id);
    }

    /**
     * Delete.
     *
     * @param id the id
     */
    public void delete(final String id) {
        repository.delete(id);
    }

    /**
     * Save division.
     *
     * @param division the division
     * @return the division
     */
    public Division save(final Division division) {
        return repository.save(division);
    }}
