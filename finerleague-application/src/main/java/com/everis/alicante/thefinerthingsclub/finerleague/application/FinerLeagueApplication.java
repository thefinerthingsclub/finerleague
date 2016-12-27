package com.everis.alicante.thefinerthingsclub.finerleague.application;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;


/**
 * The Class FinerLeagueApplication.
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages = {"com.everis.alicante.thefinerthingsclub.finerleague"})
public class FinerLeagueApplication extends SpringBootServletInitializer {

    /**
     * The Logger.
     */
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * The Application class.
     */
    private static Class<FinerLeagueApplication> applicationClass = FinerLeagueApplication.class;

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        // TODO
        System.setProperty("http.proxyHost", "10.0.8.102");
        System.setProperty("http.proxyPort", "8080");
        SpringApplication.run(FinerLeagueApplication.class, args);
    }

    /**
     * Init.
     */
    @PostConstruct
    public void init() {
        logger.info("Initializing FinerLeague Application...");
    }

    /* (non-Javadoc)
     * @see org.springframework.boot.context.web.SpringBootServletInitializer#configure(org.springframework.boot.builder.SpringApplicationBuilder)
     */
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(applicationClass);
    }
}