package com.zerlok.customrunconfigs

import com.intellij.execution.configurations.ConfigurationFactory
import com.intellij.execution.configurations.ConfigurationType
import com.intellij.execution.configurations.RunConfiguration
import com.intellij.openapi.project.Project

class RuffFixConfigurationFactory(type: ConfigurationType) : ConfigurationFactory(type) {
    override fun getId(): String = "RuffFixFactory"

    override fun createTemplateConfiguration(project: Project): RunConfiguration =
        PythonToolRunConfiguration(project, this, "ruff fix", "ruff", listOf("check", "--fix"))

    override fun getName(): String = "ruff fix"
}