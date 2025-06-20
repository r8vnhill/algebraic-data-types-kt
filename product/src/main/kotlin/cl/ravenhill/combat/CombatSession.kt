package cl.ravenhill.combat

/**
 * Tracks a fighter's current state during combat.
 *
 * This class models a combat session using an initial [FighterStats] instance, maintaining mutable health (`currentHp`)
 * and stamina (`currentStamina`) values.
 * It exposes methods to apply damage and consume stamina, while ensuring values never go below zero.
 *
 * ## Usage:
 * ```kotlin
 * val stats = FighterStats(maxHp = 100, maxStamina = 50)
 * val session = CombatSession(stats)
 *
 * session.receiveDamage(20)
 * println(session.currentHp) // 80
 *
 * session.consumeStamina(10)
 * println(session.currentStamina) // 40
 * ```
 *
 * @property currentHp Current hit points of the fighter.
 *   Cannot be set externally.
 * @property currentStamina Current stamina of the fighter.
 *   Cannot be set externally.
 */
class CombatSession(stats: FighterStats) {
    var currentHp = stats.maxHp
        private set

    var currentStamina = stats.maxStamina
        private set

    /**
     * Applies damage to the fighter, reducing [currentHp] but not below 0.
     *
     * @param amount The amount of damage to apply.
     */
    fun receiveDamage(amount: Int) {
        currentHp = (currentHp - amount).coerceAtLeast(0)
    }

    /**
     * Consumes stamina, reducing [currentStamina] but not below 0.
     *
     * @param amount The amount of stamina to consume.
     */
    fun consumeStamina(amount: Int) {
        currentStamina = (currentStamina - amount).coerceAtLeast(0)
    }
}

fun main() {
    val stats = FighterStats(maxHp = 100, maxStamina = 50)
    val session = CombatSession(stats)

    println("Initial HP: ${session.currentHp}, Stamina: ${session.currentStamina}")

    session.receiveDamage(20)
    println("After receiving 20 damage - HP: ${session.currentHp}, Stamina: ${session.currentStamina}")

    session.consumeStamina(10)
    println("After consuming 10 stamina - HP: ${session.currentHp}, Stamina: ${session.currentStamina}")
}
