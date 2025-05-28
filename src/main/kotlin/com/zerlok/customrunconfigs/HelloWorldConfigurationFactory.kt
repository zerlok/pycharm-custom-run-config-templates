package com.zerlok.customrunconfigs

import com.intellij.execution.configurations.ConfigurationFactory
import com.intellij.execution.configurations.ConfigurationType
import com.intellij.execution.configurations.RunConfiguration
import com.intellij.openapi.project.Project

class HelloWorldConfigurationFactory(type: ConfigurationType) : ConfigurationFactory(type) {
    override fun getId(): String = "HelloWorldFactory"

    override fun createTemplateConfiguration(project: Project): RunConfiguration =
        HelloWorldRunConfiguration(project, this, "Hello World")

    override fun getName(): String = "Hello World Configuration"
}