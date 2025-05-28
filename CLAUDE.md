# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Project Overview

This is a PyCharm plugin written in Kotlin that provides global run configuration templates. The plugin allows users to define run configurations that persist across all PyCharm projects, eliminating the need to recreate common configurations for each project.

## Key Architecture Components

- **Plugin Type**: IntelliJ Platform Plugin SDK project
- **Language**: Kotlin
- **Storage**: Uses `PersistentStateComponent` for global configuration storage
- **Integration**: Injects configurations via `ProjectManagerListener` when projects open
- **Settings UI**: Located under Preferences → Tools → Custom Run Config Templates

## Development Commands

```bash
# Build the plugin
./gradlew buildPlugin

# Generated plugin will be in build/distributions as a .zip file
```

## Installation & Testing

1. Build plugin with `./gradlew buildPlugin`
2. Install via PyCharm → Preferences → Plugins → Install Plugin from Disk
3. Select generated .zip from build/distributions
4. Restart PyCharm to activate

## Current State

⚠️ **Note**: This repository currently contains only documentation files (README.md, LICENSE). The actual plugin source code, build configuration (build.gradle.kts), and project structure are not yet present in the working directory.
