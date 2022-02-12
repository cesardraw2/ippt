package com.github.cesardraw2.ippt.services

import com.intellij.openapi.project.Project
import com.github.cesardraw2.ippt.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
