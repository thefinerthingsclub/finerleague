package com.everis.alicante.thefinerthingsclub.finerleague.data.config.test;

import com.mongodb.Mongo;
import cz.jirutka.spring.embedmongo.EmbeddedMongoBuilder;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * The type Mongo test config.
 */
@Configuration
@EnableMongoRepositories({"com.everis.alicante.thefinerthingsclub.finerleague.data.repository"})
public class MongoTestConfig extends AbstractMongoConfiguration {

    private static final String DB_NAME = "finerleagueTest";
    private static final String DB_VERSION = "3.4.1";
    private static final String DB_URI = "127.0.0.1";
    private static final Integer DB_PORT = 23456;

    @Override
    protected String getDatabaseName() {
        return DB_NAME;
    }

    @Override
    public Mongo mongo() throws Exception {
        return new EmbeddedMongoBuilder()
                .version(DB_VERSION)
                .bindIp(DB_URI)
                .port(DB_PORT)
                .build();
    }
}