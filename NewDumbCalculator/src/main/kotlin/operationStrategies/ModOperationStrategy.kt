package operationStrategies

class ModOperationStrategy: MathOperationStrategy {
    override fun performOperation(leftOperand: Double, rightOperand: Double): Double {
        return leftOperand % rightOperand
    }
}