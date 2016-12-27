package com.everis.alicante.thefinerthingsclub.finerleague.application;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * FinerLeaguerApplication test class
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest({FinerLeagueApplication.class, SpringApplication.class, LoggerFactory.class})
public class FinerLeagueApplicationStaticTest {

    /**
     * Tests main
     *
     * @throws Exception
     */
    @Test
    public void testMain() throws Exception {
        // Arrange
        String[] args = {};
        PowerMockito.mockStatic(SpringApplication.class);
        PowerMockito.when(SpringApplication.class, "run", FinerLeagueApplication.class, args).thenReturn(PowerMockito.mock(ConfigurableApplicationContext.class));

        // Act
        FinerLeagueApplication.main(args);

        // Assert
        PowerMockito.verifyStatic(Mockito.times(1));
    }

    /**
     * Tests init
     *
     * @throws Exception
     */
    @Test
    public void testInit() throws Exception {
        // Arrange
        final Logger logger = PowerMockito.mock(Logger.class);
        PowerMockito.mockStatic(LoggerFactory.class);
        PowerMockito.when(LoggerFactory.class, "getLogger", FinerLeagueApplication.class).thenReturn(logger);

        // Act
        (new FinerLeagueApplication()).init();

        // Assert
        Mockito.verify(logger).info("Initializing FinerLeague Application...");
    }
}
