package com.github.jakegogo.mainidestarter.services

import com.github.jakegogo.mainidestarter.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
