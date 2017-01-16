package com.everis.alicante.thefinerthingsclub.finerleague.application

import com.everis.alicante.thefinerthingsclub.finerleague.test.AbstractApplicationIT

class FinerLeagueApplicationIT extends AbstractApplicationIT {

    def "basic application integration test. Does it start up"() {
        given:
        when:
        FinerLeagueApplication.main("");
        then:
        noExceptionThrown();
    }
}
