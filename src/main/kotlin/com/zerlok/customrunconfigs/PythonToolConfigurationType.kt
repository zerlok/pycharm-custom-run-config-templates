package com.zerlok.customrunconfigs

import com.intellij.execution.configurations.ConfigurationFactory
import com.intellij.execution.configurations.ConfigurationType
import com.intellij.openapi.util.IconLoader
import javax.swing.Icon

class PythonToolConfigurationType : ConfigurationType {
    override fun getDisplayName(): String = "Python Tools"

    override fun getConfigurationTypeDescription(): String = 
        "Python development tools (mypy, ruff) run configurations"

    override fun getIcon(): Icon = IconLoader.getIcon("/icons/hello-world.svg", javaClass)

    override fun getId(): String = "PythonToolsConfig"

    override fun getConfigurationFactories(): Array<ConfigurationFactory> = 
        arrayOf(
            MypyConfigurationFactory(this),
            RuffFormatConfigurationFactory(this),
            RuffFixConfigurationFactory(this)
        )
}