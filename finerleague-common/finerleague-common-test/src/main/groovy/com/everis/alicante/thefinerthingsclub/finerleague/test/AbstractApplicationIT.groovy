package com.everis.alicante.thefinerthingsclub.finerleague.test

import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ContextConfiguration
import spock.lang.Specification

@SpringBootTest
@ContextConfiguration(locations = "classpath:data-layer-IT-context.xml")
abstract class AbstractApplicationIT extends Specification {

}
