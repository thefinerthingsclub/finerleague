package com.everis.alicante.thefinerthingsclub.finerleague.core.manager;

import com.everis.alicante.thefinerthingsclub.finerleague.data.dao.DivisionDAO;
import com.everis.alicante.thefinerthingsclub.finerleague.data.entity.Division;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * The type Division manager.
 */
@Service
public class DivisionManager {

    @Autowired
    private DivisionDAO divisionDAO;

    /**
     * Find all list.
     *
     * @return the list
     */
    public List<Division> findAll() {
        return divisionDAO.findAll();
    }

    /**
     * Find one division.
     *
     * @param id the id
     * @return the division
     */
    public Division findOne(String id) {
        return divisionDAO.findOne(id);

    }

    /**
     * Exists boolean.
     *
     * @param id the id
     * @return the boolean
     */
    public boolean exists(String id) {
        return divisionDAO.exists(id);
    }

    /**
     * Delete.
     *
     * @param id the id
     */
    public void delete(String id) {
        divisionDAO.delete(id);
    }

    /**
     * Save division.
     *
     * @param division the division
     * @return the division
     */
    public Division save(final Division division) {
        return divisionDAO.save(division);
    }
}
