// Apply the Kotlin DSL plugin to enable writing build logic using Kotlin syntax
plugins {
    `kotlin-dsl`
}

dependencies {
    // Add a dependency on the Kotlin Gradle plugin from the version catalog
    // `libs.kotlin.gradle.plugin` is defined in libs.versions.toml
    implementation(libs.kotlin.gradle.plugin)
}
