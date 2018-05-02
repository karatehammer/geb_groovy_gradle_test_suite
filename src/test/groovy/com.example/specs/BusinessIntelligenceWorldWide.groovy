package com.example.specs

import com.example.pages.GoogleHomePage
import geb.spock.GebReportingSpec
import org.junit.Test

class BusinessIntelligenceWorldWide extends GebReportingSpec {

    @Test
    def "Navigate to the Google Home Page"() {

        when:
        to GoogleHomePage

        then:
        to GoogleHomePage
    }




}