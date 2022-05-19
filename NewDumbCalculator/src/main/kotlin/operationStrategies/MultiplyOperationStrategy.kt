package operationStrategies

class MultiplyOperationStrategy: MathOperationStrategy {
    override fun performOperation(leftOperand: Double, rightOperand: Double): Double {
        return leftOperand * rightOperand
    }
}