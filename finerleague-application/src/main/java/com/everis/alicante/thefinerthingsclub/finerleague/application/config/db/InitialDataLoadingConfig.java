package com.everis.alicante.thefinerthingsclub.finerleague.application.config.db;

import com.everis.alicante.thefinerthingsclub.finerleague.common.domain.constants.FinerLeagueConfigurationConstants;
import com.mongodb.Mongo;
import org.mongeez.Mongeez;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

/**
 * The type Initial data loading.
 */
@ConfigurationProperties(FinerLeagueConfigurationConstants.APPLICATION_PROPERTIES_DATABASE)
@Configuration
public class InitialDataLoadingConfig {

    /**
     * The logger
     */
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * Initial Loading File
     */
    private String initialLoadingFile;

    /**
     * The database name
     */
    private String databaseName;

    /**
     * Init.
     *
     * @return the mongeez
     */
    @Bean(initMethod = "process")
    public Mongeez loadInitialData(final Mongo mongo) {
        logger.info("Initializing default data");
        final Mongeez mongeez = new Mongeez();
        mongeez.setMongo(mongo);
        mongeez.setDbName(databaseName);
        mongeez.setFile(new ClassPathResource(initialLoadingFile));
        return mongeez;
    }

    /**
     * Gets initial loading file.
     *
     * @return the initial loading file
     */
    public String getInitialLoadingFile() {
        return initialLoadingFile;
    }

    /**
     * Sets initial loading file.
     *
     * @param initialLoadingFile the initial loading file
     */
    public void setInitialLoadingFile(String initialLoadingFile) {
        this.initialLoadingFile = initialLoadingFile;
    }

    /**
     * Gets database name.
     *
     * @return the database name
     */
    public String getDatabaseName() {
        return databaseName;
    }

    /**
     * Sets database name.
     *
     * @param databaseName the database name
     */
    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }
}
