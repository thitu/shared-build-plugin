package com.trusona.plugins.gradle.build.internal

import spock.lang.Shared
import spock.lang.Specification

class VersionsSpec extends Specification {
    @Shared
    Versions versions

    def setup() {
        versions = versions ?: new Versions()
    }

    def "expected specific count of configured versions"() {
        expect:
        versions.versions()

        and:
        versions.versions().size() == 26
    }

    def "be able to retrive versions as JSON"() {
        expect:
        versions.versionsAsJson()
    }

    def "return null for unknown key"() {
        expect:
        !versions.version("no-such-key")
    }
}