package com.everis.alicante.thefinerthingsclub.finerleague.application;

/**
 * Created by Arturo on 24/12/2016.
 */

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;

@Configuration
public class SpringMongoConfig extends AbstractMongoConfiguration {

    @Override
    public String getDatabaseName() {
        return "yourdb";
    }

    @Override
    public Mongo mongo() throws Exception {
        return new MongoClient("127.0.0.1");
    }
}