package com.everis.alicante.thefinerthingsclub.finerleague.application.config;

import com.planetj.servlet.filter.compression.CompressingFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import javax.servlet.Filter;

/**
 * The type Compression config.
 */
@Configuration
public class CompressionConfig {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * Init.
     */
    @PostConstruct
    public void init() {
        logger.info("Initializing CompressionConfig...");
    }

    /**
     * Compressing filter filter.
     *
     * @return the filter
     */
    @Bean
    public Filter compressingFilter() {
        CompressingFilter compressingFilter = new CompressingFilter();
        return compressingFilter;
    }
}
