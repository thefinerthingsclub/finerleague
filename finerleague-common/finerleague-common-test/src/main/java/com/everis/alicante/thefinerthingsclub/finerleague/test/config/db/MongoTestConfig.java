package com.everis.alicante.thefinerthingsclub.finerleague.test.config.db;

import com.everis.alicante.thefinerthingsclub.finerleague.test.config.FinerLeagueTestConstants;
import com.mongodb.Mongo;
import cz.jirutka.spring.embedmongo.EmbeddedMongoBuilder;
import org.mongeez.Mongeez;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * The type Mongo test config.
 */
@Configuration
@EnableMongoRepositories({"com.everis.alicante.thefinerthingsclub.finerleague.data.repository"})
public class MongoTestConfig extends AbstractMongoConfiguration {

    /**
     * DB_VERSION constant
     */
    private static final String DB_VERSION = "3.4.1";
    /**
     * DB_URI constant
     */
    private static final String DB_URI = "127.0.0.1";
    /**
     * DB_PORT constant
     */
    private static final Integer DB_PORT = 23456;

    @Override
    protected String getDatabaseName() {
        return FinerLeagueTestConstants.DB_NAME;
    }

    @Override
    @Bean
    public Mongo mongo() throws Exception {
        return new EmbeddedMongoBuilder()
                .version(DB_VERSION)
                .bindIp(DB_URI)
                .port(DB_PORT)
                .build();
    }

    /**
     * Load initial data mongeez.
     *
     * @param mongo the mongo
     * @return the mongeez
     */
    @Bean(initMethod = "process")
    public Mongeez loadInitialData(final Mongo mongo) {
        final Mongeez mongeez = new Mongeez();
        mongeez.setMongo(mongo);
        mongeez.setDbName(FinerLeagueTestConstants.DB_NAME);
        mongeez.setFile(new ClassPathResource("db/mongeez_test.xml"));
        mongeez.process();
        return mongeez;
    }
}