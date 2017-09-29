package com.idexx.modules

import spock.lang.Specification

class ThisIsTheAppTest extends Specification {
    def "What's going on Dan"() {
        given:
        def svc = new ThisIsTheApp()

        when:
        def result = svc.whatsTheFrequencyKenneth()

        then:
        result.length() > 0
    }
}