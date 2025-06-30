// Set the name of the root project to "build-logic"
rootProject.name = "build-logic"

plugins {
    // Apply the Foojay toolchain resolver plugin to automatically manage JVM toolchains
    // This plugin simplifies selecting and installing the appropriate JDKs
    id("org.gradle.toolchains.foojay-resolver-convention") version "1.0.0"
}

dependencyResolutionManagement {
    @Suppress("UnstableApiUsage") // Suppress warnings for APIs marked unstable

    repositories {
        // Use Maven Central as the source for dependencies
        mavenCentral()
    }

    versionCatalogs {
        // Define a version catalog named "libs"
        // This loads version and library aliases from the given TOML file
        create("libs") {
            from(files("../gradle/libs.versions.toml"))
        }
    }
}
