@file:Suppress("SpellCheckingInspection")

package cl.ravenhill.magic

/**
 * Represents a wizard with magical abilities and power level.
 *
 * This data class includes a computed property to determine whether the wizard qualifies as an archmage and a helper
 * method to display a casting message.
 *
 * ## Usage:
 * ```kotlin
 * val natsu = Wizard("Natsu Dragneel", "Fire Dragon Roar", 9200)
 * println(natsu.isArchmage) // true
 * natsu.shout()             // Natsu Dragneel casts Fire Dragon Roar at power 9200!
 * ```
 *
 * @property name The name of the wizard.
 * @property magic The type of magic the wizard uses.
 * @property power The power level of the wizard.
 * @property isArchmage Indicates whether the wizard's power exceeds 9000.
 */
data class Wizard(val name: String, val magic: String, val power: Int) {
    val isArchmage: Boolean
        get() = power > 9000

    /**
     * Prints a dramatic casting statement to the console.
     */
    fun shout() = println("$name casts $magic at power $power!")
}

fun main() {
    // Create a new Wizard instance
    val natsu = Wizard("Natsu Dragneel", "Fire Dragon Roar", 9200)

    // Check if the wizard is an archmage
    println("Is Natsu an archmage? ${natsu.isArchmage}") // true

    // Call the shout method to display the casting message
    natsu.shout() // Natsu Dragneel casts Fire Dragon Roar at power 9200!
}
