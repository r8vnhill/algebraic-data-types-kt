package cl.ravenhill.task

/**
 * Represents the priority levels that can be assigned to a task.
 *
 * This enum can be used to categorize and order tasks based on their urgency and importance.
 *
 * @property LOW A non-urgent task with little impact if delayed.
 * @property MEDIUM A normal-priority task that should be completed in due time.
 * @property HIGH A task that is important and should be prioritized.
 * @property CRITICAL A task that has a significant impact and needs immediate attention.
 * @property BLOCKER A task that blocks progress and must be resolved before others can proceed.
 */
enum class TaskPriority {
    LOW,
    MEDIUM,
    HIGH,
    CRITICAL,
    BLOCKER
}

/**
 * Returns a color name associated with the given [TaskPriority].
 *
 * This function maps task priorities to a representative color for UI or visualization purposes.
 *
 * - `LOW` and `MEDIUM` priorities are considered safe and return `"green"`.
 * - `HIGH` priority returns `"orange"` to indicate increased urgency.
 * - `CRITICAL` and `BLOCKER` priorities return `"red"` to signal urgent or blocking issues.
 *
 * @param priority The task priority level to map to a color.
 * @return A string representing the associated color name.
 */
fun colorFor(priority: TaskPriority): String = when (priority) {
    TaskPriority.LOW, TaskPriority.MEDIUM -> "green"
    TaskPriority.HIGH -> "orange"
    TaskPriority.CRITICAL, TaskPriority.BLOCKER -> "red"
}

fun main() {
    // Example usage of TaskPriority and colorFor function
    val task1 = TaskPriority.LOW
    val task2 = TaskPriority.HIGH
    val task3 = TaskPriority.BLOCKER

    println("Task 1 priority: $task1, color: ${colorFor(task1)}") // green
    println("Task 2 priority: $task2, color: ${colorFor(task2)}") // orange
    println("Task 3 priority: $task3, color: ${colorFor(task3)}") // red
}
