package com.zerlok.customrunconfigs

import com.intellij.execution.Executor
import com.intellij.execution.configurations.*
import com.intellij.execution.runners.ExecutionEnvironment
import com.intellij.openapi.options.SettingsEditor
import com.intellij.openapi.project.Project

class HelloWorldRunConfiguration(
    project: Project,
    factory: ConfigurationFactory,
    name: String
) : RunConfigurationBase<HelloWorldRunConfigurationOptions>(project, factory, name) {

    override fun getOptions(): HelloWorldRunConfigurationOptions = super.getOptions() as HelloWorldRunConfigurationOptions

    override fun getConfigurationEditor(): SettingsEditor<out RunConfiguration> = 
        HelloWorldSettingsEditor()

    override fun checkConfiguration() {
        // No validation needed for this simple configuration
    }

    override fun getState(executor: Executor, environment: ExecutionEnvironment): RunProfileState = 
        HelloWorldRunProfileState(environment)
}