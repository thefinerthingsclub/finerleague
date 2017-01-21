package com.everis.alicante.thefinerthingsclub.finerleague.external.services.ldap.external.services.ldap.server;

import com.everis.alicante.thefinerthingsclub.finerleague.common.domain.constants.FinerLeagueConfigurationConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import javax.annotation.PostConstruct;

/**
 * The type Ldap server config.
 */
@Profile({FinerLeagueConfigurationConstants.PROFILE_LDAP})
@Configuration
@ConfigurationProperties(FinerLeagueConfigurationConstants.APPLICATION_PROPERTIES_LDAP)
public class LdapServerConfig {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private String url;

    @PostConstruct
    private void startServer() throws Exception {
        logger.info("LdapServerConfig initializing...");
    }

    /**
     * Gets url.
     *
     * @return the url
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets url.
     *
     * @param url the url
     */
    public void setUrl(String url) {
        this.url = url;
    }
}
