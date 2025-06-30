package cl.ravenhill.conn

/**
 * Represents the possible states of a connection.
 *
 * This enum is typically used to model the lifecycle of a network or resource connection.
 *
 * ## States:
 * - [CONNECTED]: The connection has been successfully established.
 * - [DISCONNECTED]: The connection has been terminated or is not available.
 * - [IN_PROGRESS]: The connection attempt is currently ongoing.
 */
enum class ConnectionState {
    CONNECTED,
    DISCONNECTED,
    IN_PROGRESS
}

/**
 * Returns a human-readable message for the given [ConnectionState].
 *
 * This function provides contextual information depending on the connection's current status.
 *
 * @param state The current state of the connection.
 * @return A descriptive message representing the connection state.
 */
fun messageForState(state: ConnectionState): String = when (state) {
    ConnectionState.CONNECTED -> "Connection established successfully."
    ConnectionState.DISCONNECTED -> "Connection has been lost."
    ConnectionState.IN_PROGRESS -> "Connection is currently being established."
}

fun main() {
    // Example usage of the ConnectionState enum and messageForState function
    println("[${ConnectionState.CONNECTED}] ${messageForState(ConnectionState.CONNECTED)}")
    println("[${ConnectionState.DISCONNECTED}] ${messageForState(ConnectionState.DISCONNECTED)}")
    println("[${ConnectionState.IN_PROGRESS}] ${messageForState(ConnectionState.IN_PROGRESS)}")
}
