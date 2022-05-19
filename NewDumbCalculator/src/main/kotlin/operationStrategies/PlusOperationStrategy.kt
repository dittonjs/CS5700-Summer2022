package operationStrategies

class PlusOperationStrategy: MathOperationStrategy {
    override fun performOperation(leftOperand: Double, rightOperand: Double): Double {
        return leftOperand + rightOperand
    }
}