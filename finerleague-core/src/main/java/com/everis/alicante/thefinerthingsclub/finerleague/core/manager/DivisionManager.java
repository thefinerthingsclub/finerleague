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
public class DivisionManager extends AbstractManager<DivisionRepository> {

    public DivisionManager(final DivisionRepository divisionRepository) {
        super(divisionRepository);
    }


}
