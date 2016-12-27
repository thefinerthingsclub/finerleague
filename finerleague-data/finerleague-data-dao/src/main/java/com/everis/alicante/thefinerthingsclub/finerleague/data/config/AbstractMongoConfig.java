package com.everis.alicante.thefinerthingsclub.finerleague.data.config;

import com.everis.alicante.thefinerthingsclub.finerleague.common.domain.constants.FinerLeagueConfigurationConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;

import javax.annotation.PostConstruct;

/**
 * The Abstract Mongo Configuration
 */
@ConfigurationProperties(FinerLeagueConfigurationConstants.APPLICATION_PROPERTIES_DATABASE)
public abstract class AbstractMongoConfig extends AbstractMongoConfiguration {

    /**
     * The logger
     */
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * The database Name
     */
    private String databaseName;

    /**
     * The database URI
     */
    private String dabaseURI;

    /**
     * the databse Port
     */
    private Integer dabasePort;

    @PostConstruct
    public void init() {
        logger.info(String.format("Mongo Configuration: databaseName [%s], databasePort [%s], databaseURI [%s], ", this.getDatabaseName(), this.getDabasePort(), this.getDabaseURI()));
    }


    @Override
    public String getDatabaseName() {
        return databaseName;
    }

    /**
     * DatabaseName getter
     *
     * @param databaseName the dataBaseName value
     */
    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * the dabaseURI getter
     *
     * @return dabaseURI value
     */
    public String getDabaseURI() {
        return dabaseURI;
    }

    /**
     * the dabaseURI setter
     *
     * @param dabaseURI
     */
    public void setDabaseURI(String dabaseURI) {
        this.dabaseURI = dabaseURI;
    }

    /**
     * the dabasePort getter
     *
     * @return the dabasePort value
     */
    public Integer getDabasePort() {
        return dabasePort;
    }

    /**
     * The dabasePort setter
     *
     * @param dabasePort new value
     */
    public void setDabasePort(Integer dabasePort) {
        this.dabasePort = dabasePort;
    }
}