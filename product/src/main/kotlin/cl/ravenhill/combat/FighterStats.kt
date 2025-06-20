package cl.ravenhill.combat

/**
 * Represents the base stats of a fighter.
 *
 * This data class defines two key attributes for a character in a combat system:
 * - Maximum hit points (`maxHp`)
 * - Maximum stamina (`maxStamina`)
 *
 * Instances of this class are immutable and support structural equality, useful for turn-based games, simulations, or
 * RPG character modeling.
 *
 * ## Usage:
 * ```kotlin
 * val stats = FighterStats(maxHp = 100, maxStamina = 50)
 * println(stats.maxHp)         // 100
 * println(stats.maxStamina)    // 50
 * ```
 *
 * @property maxHp The fighter's maximum health points.
 * @property maxStamina The fighter's maximum stamina or energy.
 */
data class FighterStats(val maxHp: Int, val maxStamina: Int)
