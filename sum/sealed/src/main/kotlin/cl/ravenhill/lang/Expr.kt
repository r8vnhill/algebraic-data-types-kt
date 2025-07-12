package cl.ravenhill.lang

/**
 * Represents an arithmetic expression.
 *
 * This sealed interface defines a small algebraic language with three kinds of expressions: constants, additions, and
 * multiplications.
 * Each expression provides a human-readable representation via the [asString] property.
 *
 * ## Usage:
 * You can compose expressions using nested data classes and retrieve their string representation.
 *
 * ### Example:
 * ```kotlin
 * val expr = Mul(Sum(Const(3), Const(5)), Const(2))
 * println(expr.asString) // Outputs: ((3 + 5) * 2)
 * ```
 */
sealed interface Expr {
    /** Returns a string representation of the expression. */
    val asString: String
}

/**
 * A constant integer value in the expression.
 *
 * @property value The integer value represented.
 */
data class Const(val value: Int) : Expr {
    override val asString: String = value.toString()
}

/**
 * An addition between two expressions.
 *
 * @property lExpr The left-hand side expression.
 * @property rExpr The right-hand side expression.
 */
data class Sum(val lExpr: Expr, val rExpr: Expr) : Expr {
    override val asString: String = "(${lExpr.asString} + ${rExpr.asString})"
}

/**
 * A multiplication between two expressions.
 *
 * @property lExpr The left-hand side expression.
 * @property rExpr The right-hand side expression.
 */
data class Mul(val lExpr: Expr, val rExpr: Expr) : Expr {
    override val asString: String = "(${lExpr.asString} * ${rExpr.asString})"
}

/**
 * Demonstrates how to construct and print a composite expression.
 */
fun main() {
    println(
        Mul(
            Sum(
                Const(3),
                Const(5)
            ),
            Const(2)
        ).asString
    )
}
