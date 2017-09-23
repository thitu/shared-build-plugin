package com.trusona.android.gradle.build.tasks

import groovy.json.JsonOutput
import org.gradle.api.DefaultTask

class TrusonaBuildTask extends DefaultTask {
    def resource = "com/trusona/android/gradle/build/trusona-versions.properties"
    def map = [:]

    TrusonaBuildTask() {
        def properties = new Properties()
        properties.load(TrusonaBuildTask.class.classLoader.getResourceAsStream(resource))
        map.putAll(properties)
    }

    def version(def key) {
        map."${key}"
    }

    def versions() {
        Collections.unmodifiableMap map
    }

    def versionsAsJson() {
        JsonOutput.toJson map
    }
}