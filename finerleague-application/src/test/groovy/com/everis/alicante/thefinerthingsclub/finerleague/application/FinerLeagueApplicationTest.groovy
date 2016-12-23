package com.everis.alicante.thefinerthingsclub.finerleague.application

import org.springframework.boot.builder.SpringApplicationBuilder
import spock.lang.Specification

/**
 * Finer League Application Test
 */
class FinerLeagueApplicationTest extends Specification {

    def "spring application builder configure"() {
        given:
        def springApplicationBuilder = Mock(SpringApplicationBuilder.class)
        def finerLeagueApplication = new FinerLeagueApplication();
        when:
        finerLeagueApplication.configure(springApplicationBuilder)
        then:
        1 * springApplicationBuilder.sources(FinerLeagueApplication.class)

    }

}
