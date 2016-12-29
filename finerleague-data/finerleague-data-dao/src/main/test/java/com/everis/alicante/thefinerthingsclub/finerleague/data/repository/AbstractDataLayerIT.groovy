package com.everis.alicante.thefinerthingsclub.finerleague.data.repository

import com.everis.alicante.thefinerthingsclub.finerleague.data.entity.EntityDocument
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.test.context.ContextConfiguration
import spock.lang.Specification

/**
 * AbstractDataLayer Spock Integration Test
 */
@SpringBootTest
@ContextConfiguration(locations = "classpath:data-layer-IT-context.xml")
abstract class AbstractDataLayerIT<E extends EntityDocument, ID extends Serializable, R extends MongoRepository<E, ID>> extends Specification {

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
