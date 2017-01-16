package com.everis.alicante.thefinerthingsclub.finerleague.application.config.db;

import com.everis.alicante.thefinerthingsclub.finerleague.common.domain.constants.FinerLeagueConfigurationConstants;
import com.mongodb.Mongo;
import cz.jirutka.spring.embedmongo.EmbeddedMongoBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Mongo Configuration for the local profile
 */
@Profile({FinerLeagueConfigurationConstants.PROFILE_DEFAULT, FinerLeagueConfigurationConstants.PROFILE_LOCAL})
@Configuration
public class MongoLocalConfig extends AbstractMongoConfig {

    /**
     * The database version
     */
    private String dabaseVersion;

    /**
     * Get mongeez runner mongeez runner.
     *
     * @return the mongeez runner
     */
    @Override
    @Bean
    public Mongo mongo() throws Exception {
        super.getLogger().info("MongeezRunner Running");
        return new EmbeddedMongoBuilder()
                .version(this.getDabaseVersion())
                .bindIp(super.getDabaseURI())
                .port(super.getDabasePort())
                .build();
    }

    /**
     * Database version getter
     *
     * @return dabaseVersion value
     */
    public String getDabaseVersion() {
        return dabaseVersion;
    }

    /**
     * dabaseVersion setter
     *
     * @param dabaseVersion the new value
     */
    public void setDabaseVersion(String dabaseVersion) {
        this.dabaseVersion = dabaseVersion;
    }
}