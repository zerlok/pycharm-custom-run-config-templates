package com.zerlok.customrunconfigs

import com.intellij.execution.configurations.CommandLineState
import com.intellij.execution.configurations.GeneralCommandLine
import com.intellij.execution.process.OSProcessHandler
import com.intellij.execution.process.ProcessHandler
import com.intellij.execution.runners.ExecutionEnvironment

class PythonToolRunProfileState(
    environment: ExecutionEnvironment,
    private val toolCommand: String,
    private val toolArgs: List<String>
) : CommandLineState(environment) {

    override fun startProcess(): ProcessHandler {
        val commandLine = GeneralCommandLine().apply {
            // Use python -m to run the tool
            exePath = "python"
            addParameter("-m")
            addParameter(toolCommand)
            
            // Add tool-specific arguments
            toolArgs.forEach { addParameter(it) }
            
            // Set working directory to project root (use $ProjectFileDir$ macro)
            withWorkDirectory("\$ProjectFileDir$")
            
            // Add current directory as target for the tools
            addParameter(".")
        }

        return OSProcessHandler(commandLine)
    }
}