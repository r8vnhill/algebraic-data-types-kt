// Apply the Kotlin JVM plugin to compile Kotlin code targeting the JVM
plugins {
    kotlin("jvm")
}

java {
    toolchain {
        // Configure the Java toolchain to use Java 21 for compiling Kotlin/JVM code
        languageVersion = JavaLanguageVersion.of(21)
    }
}
