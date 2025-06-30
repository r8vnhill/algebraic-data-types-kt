// Configure plugin resolution for the build
pluginManagement {
    // Include a composite build for shared build logic
    includeBuild("build-logic")
}

// Configure how dependencies are resolved for all included projects
dependencyResolutionManagement {
    @Suppress("UnstableApiUsage") // Suppress warnings about using incubating or experimental features

    repositories {
        // Use Maven Central as the primary repository for resolving dependencies
        mavenCentral()
    }
}

// Set the name of the root project
rootProject.name = "algebraic-data-types-kt"

// Include subprojects (modules) in the build
include("product")
include("sum")
