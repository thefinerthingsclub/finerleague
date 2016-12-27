package com.everis.alicante.thefinerthingsclub.finerleague.data.config;

import com.everis.alicante.thefinerthingsclub.finerleague.common.domain.constants.FinerLeagueConfigurationConstants;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;

/**
 * The Abstract Mongo Configuration
 */
@ConfigurationProperties(FinerLeagueConfigurationConstants.APPLICATION_PROPERTIES_DATABASE)
public abstract class AbstractMongoConfig extends AbstractMongoConfiguration {

    /**
     * The database Name
     */
    private String dabaseName;

    /**
     * The database URI
     */
    private String dabaseURI;

    /**
     * the databse Port
     */
    private Integer dabasePort;

    @Override
    public String getDatabaseName() {
        return dabaseName;
    }


    /**
     * DatabaseName getter
     *
     * @return the dataBaseName value
     */
    public String getDabaseName() {
        return dabaseName;
    }

    /**
     * DatabaseName getter
     *
     * @param dabaseName the dataBaseName value
     */
    public void setDabaseName(String dabaseName) {
        this.dabaseName = dabaseName;
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