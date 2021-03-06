package com.everis.alicante.thefinerthingsclub.finerleague.application.config.db;

import com.everis.alicante.thefinerthingsclub.finerleague.common.domain.constants.FinerLeagueConfigurationConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import javax.annotation.PostConstruct;

/**
 * The Abstract Mongo Configuration
 */
@ConfigurationProperties(FinerLeagueConfigurationConstants.APPLICATION_PROPERTIES_DATABASE)
@EnableMongoRepositories({"com.everis.alicante.thefinerthingsclub.finerleague.data.repository"})
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

    /**
     * The database user name
     */
    private String userName;

    /**
     * The database password
     */
    private String password;

    /**
     * Init.
     */
    @PostConstruct
    public void init() {
        logger.info(String.format("Mongo Configuration [%s]: databaseName [%s], databasePort [%s], databaseURI [%s], ", this.getClass().getSimpleName(), this.getDatabaseName(), this.getDabasePort(), this.getDabaseURI()));
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
     * @param dabaseURI the dabase uri
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

    /**
     * Gets user name.
     *
     * @return the user name
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets user name.
     *
     * @param userName the user name
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * Gets password.
     *
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets password.
     *
     * @param password the password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Gets logger.
     *
     * @return the logger
     */
    protected Logger getLogger() {
        return logger;
    }
}