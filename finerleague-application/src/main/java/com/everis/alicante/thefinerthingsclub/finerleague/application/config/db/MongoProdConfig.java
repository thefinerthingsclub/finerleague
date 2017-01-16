package com.everis.alicante.thefinerthingsclub.finerleague.application.config.db;

import com.everis.alicante.thefinerthingsclub.finerleague.common.domain.constants.FinerLeagueConfigurationConstants;
import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * The Mongo Configuration for the prod profile
 */
@Profile({FinerLeagueConfigurationConstants.PROFILE_PROD})
@Configuration
public class MongoProdConfig extends AbstractMongoConfig {

    @Override
    @Bean
    public Mongo mongo() throws Exception {
        return new MongoClient(super.getDabaseURI(), super.getDabasePort());
    }
}