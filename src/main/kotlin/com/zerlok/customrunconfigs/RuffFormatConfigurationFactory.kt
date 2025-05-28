package com.zerlok.customrunconfigs

import com.intellij.execution.configurations.ConfigurationFactory
import com.intellij.execution.configurations.ConfigurationType
import com.intellij.execution.configurations.RunConfiguration
import com.intellij.openapi.project.Project

class RuffFormatConfigurationFactory(type: ConfigurationType) : ConfigurationFactory(type) {
    override fun getId(): String = "RuffFormatFactory"

    override fun createTemplateConfiguration(project: Project): RunConfiguration =
        PythonToolRunConfiguration(project, this, "ruff format", "ruff", listOf("format"))

    override fun getName(): String = "ruff format"
}