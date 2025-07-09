package cl.ravenhill.platform

/**
 * Represents a target platform for name validation rules.
 *
 * Each platform defines specific constraints for validating names depending on its usage context (e.g., web, mobile,
 * console).
 * The [description] property provides a human-readable summary of the rules, and the [validate] method checks whether a
 * given name meets those rules.
 *
 * ## Usage:
 * Useful in multi-platform applications where names must adhere to platform-specific constraints.
 *
 * ### Example 1: Validate a name for web
 * ```kotlin
 * val isValid = ValidationPlatform.WEB.validate("User123") // true
 * println(ValidationPlatform.WEB.description)
 * ```
 * ### Example 2: Reject name for console with vowels
 * ```kotlin
 * val isValid = ValidationPlatform.CONSOLE.validate("STRIKERS") // false
 * ```
 * @property description A textual summary of the validation rule for each platform.
 */
enum class ValidationPlatform {
    /**
     * Web platform:
     * Accepts names with 4 to 12 alphanumeric characters.
     */
    WEB {
        override val description: String =
            "Web platform with strict naming rules: 4–12 characters, alphanumeric only"

        override fun validate(name: String): Boolean =
            name.length in 4..12 && name.all { it.isLetterOrDigit() }
    },

    /**
     * Mobile platform:
     * Accepts names that start with a letter, followed by alphanumeric characters or underscores.
     */
    MOBILE {
        override val description: String =
            "Mobile platform with flexible naming: first character must be a letter, rest alphanumeric or underscore"

        override fun validate(name: String): Boolean =
            name.first().isLetter() && name.all { it.isLetterOrDigit() || it == '_' }
    },

    /**
     * Console platform:
     * Accepts names with exactly 8 characters and no vowels.
     */
    CONSOLE {
        override val description: String =
            "Console platform with unique naming: 8 characters, no vowels allowed"

        override fun validate(name: String): Boolean {
            val vowels = "aeiouAEIOU".toSet()
            return name.length == 8 && name.none { it in vowels }
        }
    };

    /**
     * Returns a human-readable description of the platform's validation rule.
     */
    abstract val description: String

    /**
     * Validates a name string according to the platform's rules.
     *
     * @param name The name to validate.
     * @return `true` if the name is valid for this platform, `false` otherwise.
     */
    abstract fun validate(name: String): Boolean
}

/**
 * Prints validation results for a given name across all platforms.
 *
 * Iterates through all entries of [ValidationPlatform] and prints:
 * - The name of the platform.
 * - A description of its validation rules.
 * - Whether the given name is valid, according to those rules.
 *
 * ## Usage:
 * Useful for debugging, testing, or presenting how a name would be interpreted differently by each validation platform.
 *
 * ### Example 1: Test a name across platforms
 * ```kotlin
 * printValidationInfo("Player_1")
 * ```
 * @param name The name to be validated against each platform's rules.
 */
fun printValidationInfo(name: String) {
    for (platform in ValidationPlatform.entries) {
        println(buildString {
            appendLine("Platform: ${platform.name}")
            appendLine("Description: ${platform.description}")
            appendLine("Is '$name' valid? ${platform.validate(name)}")
        })
    }
}

fun main() {
    val namesToTest = listOf("User123", "my_name", "Console1", "123", "ABCDEFGH")

    for (name in namesToTest) {
        println("🔍 Validating username: \"$name\"\n")
        printValidationInfo(name)
        println("-".repeat(40)) // separator
    }
}
