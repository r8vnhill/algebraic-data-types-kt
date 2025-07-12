// Declares the custom plugin "jvm.conventions" but does not apply it immediately.
// This allows subprojects to apply it manually or programmatically as needed.
plugins {
    id("jvm.conventions") apply false
}

subprojects {
    // Applies the "jvm.conventions" plugin to all subprojects.
    // This ensures consistent configuration across all JVM modules.
    plugins.apply("jvm.conventions")
}
