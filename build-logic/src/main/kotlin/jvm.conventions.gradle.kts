// Apply the Kotlin JVM plugin to compile Kotlin code targeting the JVM
plugins {
    kotlin("jvm")
}

kotlin {
    jvmToolchain {
        // Configure the Java toolchain to use Java 21 for compiling Kotlin/JVM code
        languageVersion.set(JavaLanguageVersion.of(21))
    }

    compilerOptions {
        freeCompilerArgs.add("-Xcontext-sensitive-resolution")
    }
}
