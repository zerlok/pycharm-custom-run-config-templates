package com.zerlok.customrunconfigs

import com.intellij.execution.configurations.ConfigurationFactory
import com.intellij.execution.configurations.ConfigurationType
import com.intellij.openapi.util.IconLoader
import javax.swing.Icon

class HelloWorldConfigurationType : ConfigurationType {
    override fun getDisplayName(): String = "Hello World Custom Config"

    override fun getConfigurationTypeDescription(): String = 
        "A simple run configuration that prints 'hello world from custom run config templates'"

    override fun getIcon(): Icon = IconLoader.getIcon("/icons/hello-world.svg", javaClass)

    override fun getId(): String = "HelloWorldCustomRunConfig"

    override fun getConfigurationFactories(): Array<ConfigurationFactory> = 
        arrayOf(HelloWorldConfigurationFactory(this))
}