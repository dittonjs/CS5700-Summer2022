package operationStrategies

interface MathOperationStrategy {
    fun performOperation(leftOperand: Double, rightOperand: Double): Double
}