package com.everis.alicante.thefinerthingsclub.finerleague.application.config;

import com.everis.alicante.thefinerthingsclub.finerleague.common.domain.constants.FinerLeagueConfigurationConstants;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.stereotype.Component;

/**
 * The type Custom embedded servlet container customizer.
 */
@Component
public class CustomEmbeddedServletContainerCustomizer implements EmbeddedServletContainerCustomizer {

    @Override
    public void customize(final ConfigurableEmbeddedServletContainer container) {
        container.setContextPath(FinerLeagueConfigurationConstants.ROOT_CONTEXT_PATH);
    }
}
