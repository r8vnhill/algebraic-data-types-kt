package cl.ravenhill.compiler

/**
 * Represents a sequence of optimization passes applied during compilation.
 *
 * Each enum constant corresponds to a common optimization step used to improve code performance or reduce size.
 * The [next] function allows cycling through the available passes in declaration order.
 *
 * ## Usage:
 * Useful when iterating through or scheduling compiler optimizations in phases.
 *
 * ### Example 1: Advance to the next optimization pass
 * ```kotlin
 * val pass = OptimizationPass.INLINE_FUNCTIONS
 * val next = pass.next() // REMOVE_DEAD_CODE
 * ```
 */
enum class OptimizationPass {
    /**
     * Replaces function calls with their bodies to eliminate call overhead.
     */
    INLINE_FUNCTIONS,

    /**
     * Eliminates code paths that cannot be reached during execution.
     */
    REMOVE_DEAD_CODE,

    /**
     * Evaluates constant expressions at compile time to reduce runtime overhead.
     */
    FOLD_CONSTANTS;

    /**
     * Returns the next optimization pass in declaration order.
     * Wraps around to the first pass after the last one.
     */
    fun next(): OptimizationPass =
        entries[(ordinal + 1) % entries.size]
}

fun main() {
    // Get the name of a specific optimization pass
    val name: String = OptimizationPass.INLINE_FUNCTIONS.name
    println("${OptimizationPass.INLINE_FUNCTIONS} name: $name")

    // List all declared optimization passes
    println("\nOptimization Passes:")
    for (phase in OptimizationPass.entries) {
        println("> ${phase.name}")
    }

    // Display how each 'optimization pass' transitions to the next one
    println("\nTransitions:")
    OptimizationPass.entries.forEach { phase ->
        println(buildString {
            append(phase.name)
            append(" -> ")
            append(phase.next().name)
        })
    }

    // Retrieve an enum value by its string name
    val phase = OptimizationPass.valueOf("INLINE_FUNCTIONS")
    println("Current build phase: ${phase.name}")

    // Attempting to retrieve a non-existent value will throw an exception
    try {
        OptimizationPass.valueOf("INVALID_PHASE")
    } catch (e: IllegalArgumentException) {
        println("Caught an exception: ${e.message}")
    }
}
