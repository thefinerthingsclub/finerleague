package com.everis.alicante.thefinerthingsclub.finerleague.core.manager;

import com.everis.alicante.thefinerthingsclub.finerleague.data.entity.Division;
import com.everis.alicante.thefinerthingsclub.finerleague.data.repository.DivisionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * The type Division manager.
 */
@Service
public class DivisionManager {

    @Autowired
    private DivisionRepository divisionRepository;

    /**
     * Find all list.
     *
     * @return the list
     */
    public List<Division> findAll() {
        return divisionRepository.findAll();
    }

    /**
     * Find one division.
     *
     * @param id the id
     * @return the division
     */
    public Division findOne(final String id) {
        return divisionRepository.findOne(id);

    }

    /**
     * Exists boolean.
     *
     * @param id the id
     * @return the boolean
     */
    public boolean exists(final String id) {
        return divisionRepository.exists(id);
    }

    /**
     * Delete.
     *
     * @param id the id
     */
    public void delete(final String id) {
        divisionRepository.delete(id);
    }

    /**
     * Save division.
     *
     * @param division the division
     * @return the division
     */
    public Division save(final Division division) {
        return divisionRepository.save(division);
    }
}
