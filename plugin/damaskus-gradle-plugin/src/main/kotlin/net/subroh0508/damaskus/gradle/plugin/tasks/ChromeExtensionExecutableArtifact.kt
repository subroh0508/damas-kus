package net.subroh0508.damaskus.gradle.plugin.tasks

import org.gradle.api.Project
import org.gradle.kotlin.dsl.getValue

fun Project.chromeExtensionExecutableArtifact() {
    val copyCommonResources by buildCopyCommonResources()

    chromeExtensionDevelopmentExecutableArtifact(copyCommonResources)
    chromeExtensionProductionExecutableArtifact(copyCommonResources)
}
