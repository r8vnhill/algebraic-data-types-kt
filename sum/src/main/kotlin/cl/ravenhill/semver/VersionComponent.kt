package cl.ravenhill.semver


/**
 * Represents a component of a semantic version.
 *
 * Each enum value corresponds to one of the versioning levels: MAJOR, MINOR, or PATCH.
 * Every component has an identifier and a mutable counter used to track its current value.
 *
 * ## Usage:
 *
 * ### Example 1: Bump version component
 * ```kotlin
 * VersionComponent.MINOR.bump()
 * println(VersionComponent.MINOR.current) // 1
 * ```
 * ### Example 2: Reset component after major bump
 * ```kotlin
 * VersionComponent.MAJOR.bump()
 * VersionComponent.MINOR.reset()
 * VersionComponent.PATCH.reset()
 * ```
 * @property identifier A string label for the version component.
 * @property current The current numeric value of the component.
 */
enum class VersionComponent(val identifier: String, var current: Int) {
    MAJOR("major", 0),
    MINOR("minor", 0),
    PATCH("patch", 0);

    /**
     * Increments the current value of this component by one.
     */
    fun bump() {
        current++
    }

    /**
     * Resets the current value of this component to zero.
     */
    fun reset() {
        current = 0
    }
}


fun main() {
    println("🔍 Initial Version State:\n")
    println("${VersionComponent.MAJOR.identifier}: ${VersionComponent.MAJOR.current}")
    println("${VersionComponent.MINOR.identifier}: ${VersionComponent.MINOR.current}")
    println("${VersionComponent.PATCH.identifier}: ${VersionComponent.PATCH.current}")

    println("\n🔧 Performing version updates...\n")

    VersionComponent.MAJOR.bump()
    VersionComponent.MINOR.bump()
    VersionComponent.PATCH.bump()
    VersionComponent.PATCH.bump()

    println("Updated Version State:\n")
    println("${VersionComponent.MAJOR.identifier}: ${VersionComponent.MAJOR.current}")
    println("${VersionComponent.MINOR.identifier}: ${VersionComponent.MINOR.current}")
    println("${VersionComponent.PATCH.identifier}: ${VersionComponent.PATCH.current}")

    println("\n🔄 Resetting all components...\n")
    VersionComponent.MAJOR.reset()
    VersionComponent.MINOR.reset()
    VersionComponent.PATCH.reset()

    println("Version components reset to zero:\n")
    println("${VersionComponent.MAJOR.identifier}: ${VersionComponent.MAJOR.current}")
    println("${VersionComponent.MINOR.identifier}: ${VersionComponent.MINOR.current}")
    println("${VersionComponent.PATCH.identifier}: ${VersionComponent.PATCH.current}")
}
