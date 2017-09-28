package com.trusona.plugins.gradle.build.internal

import groovy.json.JsonOutput

class Versions {
    def resource = "com/trusona/plugins/gradle/build/internal/trusona-versions.properties"
    def map = [:]

    Versions() {
        def properties = new Properties()
        properties.load(Versions.class.classLoader.getResourceAsStream(resource))
        map.putAll(properties)
    }

    def version(def key) {
        map."${key}"
    }

    def versions() {
        Collections.unmodifiableMap map
    }

    def versionsAsJson() {
        JsonOutput.prettyPrint(JsonOutput.toJson(map))
    }
}