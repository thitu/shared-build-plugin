package com.trusona.android.gradle.build

import com.trusona.android.gradle.build.tasks.TrusonaBuildTask
import org.gradle.api.Plugin
import org.gradle.api.Project

class TrusonaPlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        try {
            project.tasks.create("trusona", TrusonaBuildTask)
        } catch (MissingMethodException e) {
            throw new RuntimeException("you need a newer version of gradle", e)
        }
    }
}