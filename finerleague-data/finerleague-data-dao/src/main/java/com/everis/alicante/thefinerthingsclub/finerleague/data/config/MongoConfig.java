package com.everis.alicante.thefinerthingsclub.finerleague.data.config;

import com.mongodb.Mongo;
import cz.jirutka.spring.embedmongo.EmbeddedMongoBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;

import javax.annotation.PostConstruct;

@Configuration
public class MongoConfig extends AbstractMongoConfiguration {

    /**
     * The logger
     */
    private final Logger logger = LoggerFactory.getLogger(MongoConfig.class);

    @PostConstruct
    public void init() {
        logger.info("Initializing MongoDB Configuration...");
    }

    @Override
    public String getDatabaseName() {
        return "yourdb";
    }

    @Override
    public Mongo mongo() throws Exception {
        return new EmbeddedMongoBuilder()
                .version("2.6.1")
                .bindIp("127.0.0.1")
                .port(12345)
                .build();
    }
}