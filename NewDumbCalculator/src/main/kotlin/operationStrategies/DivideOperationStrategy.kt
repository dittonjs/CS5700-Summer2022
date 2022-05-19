package operationStrategies

class DivideOperationStrategy: MathOperationStrategy {
    override fun performOperation(leftOperand: Double, rightOperand: Double): Double {
        return leftOperand / rightOperand
    }
}