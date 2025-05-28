package com.zerlok.customrunconfigs

import com.intellij.openapi.options.SettingsEditor
import com.intellij.openapi.ui.LabeledComponent
import com.intellij.ui.components.JBTextField
import javax.swing.JComponent
import javax.swing.JPanel
import java.awt.BorderLayout

class HelloWorldSettingsEditor : SettingsEditor<HelloWorldRunConfiguration>() {
    private val panel = JPanel(BorderLayout())
    private val nameField = JBTextField()

    init {
        val labeledComponent = LabeledComponent.create(nameField, "Configuration Name:")
        panel.add(labeledComponent, BorderLayout.NORTH)
    }

    override fun resetEditorFrom(configuration: HelloWorldRunConfiguration) {
        nameField.text = configuration.name
    }

    override fun applyEditorTo(configuration: HelloWorldRunConfiguration) {
        configuration.name = nameField.text
    }

    override fun createEditor(): JComponent = panel
}