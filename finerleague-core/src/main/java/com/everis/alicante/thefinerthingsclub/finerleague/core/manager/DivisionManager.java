package com.everis.alicante.thefinerthingsclub.finerleague.core.manager;

import com.everis.alicante.thefinerthingsclub.finerleague.data.entity.Division;
import com.everis.alicante.thefinerthingsclub.finerleague.data.repository.DivisionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * The type Division manager.
 */
@Service
public class DivisionManager extends AbstractManager<DivisionRepository, Division, String> {

    /**
     * Instantiates a new Division manager.
     *
     * @param repository the repository
     */
    @Autowired
    public DivisionManager(final DivisionRepository repository) {
        super(repository);
    }
}
