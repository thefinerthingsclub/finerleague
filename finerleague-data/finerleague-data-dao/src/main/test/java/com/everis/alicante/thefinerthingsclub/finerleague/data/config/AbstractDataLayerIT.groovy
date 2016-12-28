package com.everis.alicante.thefinerthingsclub.finerleague.data.config

import com.everis.alicante.thefinerthingsclub.finerleague.data.entity.EntityDocument
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.test.context.ContextConfiguration
import spock.lang.Specification

/**
 * AbstractDataLayer Spock Integration Test
 */
@SpringBootTest
@ContextConfiguration(locations = "classpath:application-context.xml")
abstract class AbstractDataLayerIT<E extends EntityDocument, ID extends Serializable, R extends MongoRepository<E, ID>> extends Specification {

    def setup() {
        getRepository().deleteAll();
    }

    def "test save"() {
        given:
        def entityToSave = this.createEntity();
        when:
        def newEntity = getRepository().save(entityToSave);
        then:
        newEntity.getId() != null
    }

    def abstract E createEntity();

    def abstract R getRepository();

}
