package com.everis.alicante.thefinerthingsclub.finerleague.data.repository

import com.everis.alicante.thefinerthingsclub.finerleague.data.entity.EntityDocument
import com.everis.alicante.thefinerthingsclub.finerleague.test.AbstractApplicationIT
import com.mongodb.Mongo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.core.io.ResourceLoader
import org.springframework.data.mongodb.core.MongoTemplate
import org.springframework.data.mongodb.repository.MongoRepository

/**
 * AbstractDataLayer Spock Integration Test
 */
abstract class AbstractDataLayerIT<E extends EntityDocument, ID extends Serializable, R extends MongoRepository<E, ID>> extends AbstractApplicationIT {

    /**
     * Create entity abstract method
     * @return the new entity
     */
    abstract E createEntity();

    /**
     * Gets the repository instance
     * @return the repository instance
     */
    abstract R getRepository();

    /**
     * The Mongo Template
     */
    @Autowired
    MongoTemplate mongoTemplate;

    @Autowired
    Mongo mongo;

    /**
     * The Spring resource loader
     */
    @Autowired
    ResourceLoader resourceLoader;

    /**
     * IT Setup
     *
     */
    def setup() {
        getRepository().deleteAll();
    }

    /**
     * Test save
     */
    def "test save"() {
        given:
        def entityToSave = this.createEntity();
        when:
        def newEntity = getRepository().save(entityToSave);
        then:
        newEntity.getId() != null;
    }


}
