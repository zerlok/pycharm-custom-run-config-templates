package com.zerlok.customrunconfigs

import com.intellij.execution.ExecutionResult
import com.intellij.execution.Executor
import com.intellij.execution.configurations.CommandLineState
import com.intellij.execution.configurations.GeneralCommandLine
import com.intellij.execution.process.OSProcessHandler
import com.intellij.execution.process.ProcessHandler
import com.intellij.execution.runners.ExecutionEnvironment
import com.intellij.execution.runners.ProgramRunner

class HelloWorldRunProfileState(environment: ExecutionEnvironment) : CommandLineState(environment) {

    override fun startProcess(): ProcessHandler {
        // Create a simple command that prints our hello world message
        val commandLine = GeneralCommandLine().apply {
            when {
                System.getProperty("os.name").lowercase().contains("windows") -> {
                    exePath = "cmd"
                    addParameter("/c")
                    addParameter("echo hello world from custom run config templates")
                }
                else -> {
                    exePath = "sh"
                    addParameter("-c")
                    addParameter("echo 'hello world from custom run config templates'")
                }
            }
        }

        return OSProcessHandler(commandLine)
    }
}