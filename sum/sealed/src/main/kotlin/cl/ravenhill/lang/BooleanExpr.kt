package cl.ravenhill.lang

/**
 * Represents a logical boolean expression.
 *
 * This sealed interface defines a small algebraic language for boolean logic with support for:
 * - constants ([True], [False])
 * - binary operations ([And], [Or])
 * - unary operations ([Not])
 *
 * Each expression provides a human-readable representation via the [asString] property.
 */
sealed interface BooleanExpr {
    /** Returns a string representation of the expression. */
    val asString: String
}

/**
 * Boolean constant representing `true`.
 */
data object True : BooleanExpr {
    override val asString: String = "True"
}

/**
 * Boolean constant representing `false`.
 */
data object False : BooleanExpr {
    override val asString: String = "False"
}

/**
 * Binary logical AND operation.
 *
 * @property left The left operand.
 * @property right The right operand.
 */
data class And(val left: BooleanExpr, val right: BooleanExpr) : BooleanExpr {
    override val asString: String = "(${left.asString} AND ${right.asString})"
}

/**
 * Binary logical OR operation.
 *
 * @property left The left operand.
 * @property right The right operand.
 */
data class Or(val left: BooleanExpr, val right: BooleanExpr) : BooleanExpr {
    override val asString: String = "(${left.asString} OR ${right.asString})"
}

/**
 * Unary logical NOT operation.
 *
 * @property expr The operand to negate.
 */
data class Not(val expr: BooleanExpr) : BooleanExpr {
    override val asString: String = "NOT ${expr.asString}"
}

/**
 * Recursively evaluates a [BooleanExpr] to its boolean result.
 *
 * ## Usage:
 * ```kotlin
 * val result = eval(And(True, Not(False))) // true
 * ```
 *
 * @param expr The expression to evaluate.
 * @return The boolean result of the expression.
 */
fun eval(expr: BooleanExpr): Boolean = when (expr) {
    is True -> true
    is False -> false
    is And -> eval(expr.left) && eval(expr.right)
    is Or -> eval(expr.left) || eval(expr.right)
    is Not -> !eval(expr.expr)
}

/**
 * Demonstrates how to construct and evaluate a compound boolean expression.
 */
fun main() {
    val expression = And(
        Or(True, False),
        Not(False)
    )
    println("Evaluating expression: ${expression.asString}")
    val result = eval(expression)
    println("Result: $result") // Outputs: Result: true
}
