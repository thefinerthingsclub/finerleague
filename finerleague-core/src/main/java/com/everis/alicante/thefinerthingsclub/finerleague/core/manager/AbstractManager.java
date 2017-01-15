package com.everis.alicante.thefinerthingsclub.finerleague.core.manager;

import com.everis.alicante.thefinerthingsclub.finerleague.data.entity.EntityDocument;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.io.Serializable;
import java.util.List;


/**
 * The type Abstract manager.
 *
 * @param <R>  the type parameter
 * @param <E>  the type parameter
 * @param <ID> the type parameter
 */
public class AbstractManager<R extends MongoRepository<E, ID>, E extends EntityDocument, ID extends Serializable> {

    private R repository;
    private Class<E> entityClass;
    private Class<ID> idClass;


    /**
     * Instantiates a new Abstract manager.
     *
     * @param repository the repository
     */
    protected AbstractManager(final R repository) {
        this.repository = repository;
    }


    /**
     * Find all list.
     *
     * @return the list
     */
    public List<E> findAll() {
        return repository.findAll();
    }


    /**
     * Find one t.
     *
     * @param id the id
     * @return the t
     */
    public E findOne(final ID id) {
        return repository.findOne(id);

    }

    /**
     * Exists boolean.
     *
     * @param id the id
     * @return the boolean
     */
    public boolean exists(final ID id) {
        return repository.exists(id);
    }


    /**
     * Delete.
     *
     * @param id the id
     */
    public void delete(final ID id) {
        repository.delete(id);
    }

    /**
     * Delete.
     *
     * @param ids the ids
     */
    public void delete(final List<ID> ids) {
        final Iterable<E> entityCollection = repository.findAll(ids);
        repository.delete(entityCollection);
    }

    /**
     * Save t.
     *
     * @param entity the entity
     * @return the t
     */
    public E save(final E entity) {
        return repository.save(entity);
    }

    /**
     * Gets repository.
     *
     * @return the repository
     */
    protected R getRepository() {
        return repository;
    }
}
