package com.zerlok.customrunconfigs

import com.intellij.execution.configurations.ConfigurationFactory
import com.intellij.execution.configurations.ConfigurationType
import com.intellij.execution.configurations.RunConfiguration
import com.intellij.openapi.project.Project

class MypyConfigurationFactory(type: ConfigurationType) : ConfigurationFactory(type) {
    override fun getId(): String = "MypyFactory"

    override fun createTemplateConfiguration(project: Project): RunConfiguration =
        PythonToolRunConfiguration(project, this, "mypy", "mypy")

    override fun getName(): String = "mypy"
}