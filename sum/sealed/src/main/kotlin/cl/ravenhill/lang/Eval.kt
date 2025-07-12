package cl.ravenhill.lang

/**
 * Evaluates an arithmetic expression represented by [Expr].
 *
 * This function performs structural recursion over the expression tree:
 * - [Const] returns its value directly.
 * - [Sum] returns the sum of its left and right subexpressions.
 * - [Mul] returns the product of its left and right subexpressions.
 *
 * ## Usage:
 * Useful for interpreting expressions defined using the [Expr] algebraic model.
 *
 * ### Example:
 * ```kotlin
 * val result = eval(Mul(Sum(Const(3), Const(5)), Const(2))) // 16
 * ```
 *
 * @param expr The expression to evaluate.
 * @return The integer result of evaluating the expression.
 */
fun eval(expr: Expr): Int = when (expr) {
    is Const -> expr.value
    is Sum -> eval(expr.lExpr) + eval(expr.rExpr)
    is Mul -> eval(expr.lExpr) * eval(expr.rExpr)
}

/**
 * Demonstrates evaluation of a composed arithmetic expression.
 */
fun main() {
    val expression = Mul(Sum(Const(3), Const(5)), Const(2))
    println("Evaluating expression: ${expression.asString}")
    val result = eval(expression)
    println("Result: $result") // Outputs: Result: 16
}
