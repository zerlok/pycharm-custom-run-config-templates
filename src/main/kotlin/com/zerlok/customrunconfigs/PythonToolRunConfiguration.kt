package com.zerlok.customrunconfigs

import com.intellij.execution.Executor
import com.intellij.execution.configurations.*
import com.intellij.execution.runners.ExecutionEnvironment
import com.intellij.openapi.options.SettingsEditor
import com.intellij.openapi.project.Project

class PythonToolRunConfiguration(
    project: Project,
    factory: ConfigurationFactory,
    name: String,
    private val toolCommand: String,
    private val toolArgs: List<String> = emptyList()
) : RunConfigurationBase<PythonToolRunConfigurationOptions>(project, factory, name) {

    override fun getOptions(): PythonToolRunConfigurationOptions = super.getOptions() as PythonToolRunConfigurationOptions

    override fun getConfigurationEditor(): SettingsEditor<out RunConfiguration> = 
        PythonToolSettingsEditor()

    override fun checkConfiguration() {
        // Basic validation - could be extended to check if Python/tools are available
    }

    override fun getState(executor: Executor, environment: ExecutionEnvironment): RunProfileState = 
        PythonToolRunProfileState(environment, toolCommand, toolArgs)
}