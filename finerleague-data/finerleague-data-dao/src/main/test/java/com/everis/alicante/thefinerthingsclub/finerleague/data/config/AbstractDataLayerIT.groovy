package com.everis.alicante.thefinerthingsclub.finerleague.data.config

import org.springframework.boot.test.context.SpringBootTest
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories
import org.springframework.test.context.ContextConfiguration
import spock.lang.Specification

/**
 * AbstractDataLayer Spock Integration Test
 */
@SpringBootTest
@ContextConfiguration(locations = "classpath:application-context.xml")
@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages = "com.everis.alicante.thefinerthingsclub.finerleague")
@EnableMongoRepositories("com.everis.alicante.thefinerthingsclub.finerleague.data.repository")

abstract class AbstractDataLayerIT extends Specification {
}
