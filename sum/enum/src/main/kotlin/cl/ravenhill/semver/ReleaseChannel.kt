package cl.ravenhill.semver

/**
 * Represents the release channel of a version.
 *
 * Each enum constant defines a level of stability and target audience for the release, ranging from production-ready
 * ([STABLE]) to experimental ([ALPHA]).
 *
 * ## Usage:
 * The enum provides a [description] method that returns a human-readable summary of what each release channel implies.
 *
 * ### Example 1: Print release description
 * ```kotlin
 * println(ReleaseChannel.BETA.description())
 * // Output: Version with new features, may contain bugs but is more stable than alpha
 * ```
 */
enum class ReleaseChannel {
    /**
     * Stable release: suitable for production environments.
     */
    STABLE {
        override val description: String =
            "Ready for production use, fully tested and stable"
    },

    /**
     * Beta release: includes new features, may still have bugs.
     */
    BETA {
        override val description: String =
            "Version with new features, may contain bugs but is more stable than alpha"
    },

    /**
     * Alpha release: experimental and likely to change.
     */
    ALPHA {
        override val description: String =
            "Experimental version subject to significant changes"
    };

    /**
     * Returns a textual description of the release channel.
     */
    abstract val description: String
}

fun main() {
    println("Release Channels:")
    println("${ReleaseChannel.STABLE}: ${ReleaseChannel.STABLE.description}")
    println("${ReleaseChannel.BETA}: ${ReleaseChannel.BETA.description}")
    println("${ReleaseChannel.ALPHA}: ${ReleaseChannel.ALPHA.description}")
}
