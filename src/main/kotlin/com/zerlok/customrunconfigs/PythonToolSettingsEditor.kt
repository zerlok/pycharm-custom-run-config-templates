package com.zerlok.customrunconfigs

import com.intellij.openapi.options.SettingsEditor
import com.intellij.openapi.ui.LabeledComponent
import com.intellij.ui.components.JBTextField
import javax.swing.JComponent
import javax.swing.JPanel
import java.awt.BorderLayout

class PythonToolSettingsEditor : SettingsEditor<PythonToolRunConfiguration>() {
    
    private val panel = JPanel(BorderLayout())
    private val nameField = JBTextField()
    
    init {
        val nameComponent = LabeledComponent.create(nameField, "Configuration name:")
        panel.add(nameComponent, BorderLayout.NORTH)
    }

    override fun resetEditorFrom(configuration: PythonToolRunConfiguration) {
        nameField.text = configuration.name
    }

    override fun applyEditorTo(configuration: PythonToolRunConfiguration) {
        configuration.name = nameField.text
    }

    override fun createEditor(): JComponent = panel
}