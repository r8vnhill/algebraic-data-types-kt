package cl.ravenhill.log

/**
 * Represents the severity level of a log message.
 *
 * This enum is typically used to categorize and filter logs based on importance or urgency.
 *
 * ## Levels:
 * - `INFO`: General information about application flow.
 * - `WARNING`: A potential issue or unexpected situation that doesn't prevent execution.
 * - `ERROR`: A serious problem that likely affects execution or system state.
 */
enum class LogLevel {
    INFO,
    WARNING,
    ERROR
}

/**
 * Logs a message with the given [LogLevel].
 *
 * If the level is [LogLevel.ERROR], the message is printed to standard error.
 * Otherwise, it is printed to standard output.
 *
 * ## Usage:
 * ```kotlin
 * log("Everything is running smoothly", LogLevel.INFO)
 * log("Disk space low", LogLevel.WARNING)
 * log("Failed to connect to database", LogLevel.ERROR)
 * ```
 *
 * @param message The message to log.
 * @param level The severity level of the log message.
 */
fun log(message: String, level: LogLevel) {
    if (level == LogLevel.ERROR) {
        System.err.println("$level: $message")
    } else {
        println("$level: $message")
    }
}

fun main() {
    log("I am a genius", LogLevel.INFO)
    log("Oh no!", LogLevel.ERROR)
}
