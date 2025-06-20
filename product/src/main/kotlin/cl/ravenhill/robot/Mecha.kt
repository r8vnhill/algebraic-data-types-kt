package cl.ravenhill.robot

/**
 * Represents a mecha unit with a name and power level.
 *
 * This is a simple data class modeling a product type with two fields:
 * - `name`: The name or designation of the mecha (e.g., "Evangelion Unit-01").
 * - `power`: The combat or operational power level of the mecha.
 *
 * The class provides structural equality, a readable string representation, and destructuring support out of the box.
 *
 * ### Example:
 * ```kotlin
 * val eva = Mecha("Unit-01", 9000)
 * println(eva) // Mecha(name=Unit-01, power=9000)
 * ```
 *
 * @property name The mecha's identifier or model name.
 * @property power The power level associated with the mecha.
 */
data class Mecha(val name: String, val power: Int)

fun main() {
    // Create a new Mecha instance with the name "Gurren" and power level 3000
    val gurren = Mecha("Gurren", 3000)

    // Create a modified copy of the original, changing both the name and power
    val gurrenLagann = gurren.copy(name = "Gurren Lagann", power = 9000)

    // Print the original mecha
    println(gurren)         // Output: Mecha(name=Gurren, power=3000)

    // Print the modified copy
    println(gurrenLagann)   // Output: Mecha(name=Gurren Lagann, power=9000)
}
