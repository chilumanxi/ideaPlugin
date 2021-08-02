package com.github.chilumanxi.ideaplugin.services

import com.github.chilumanxi.ideaplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
