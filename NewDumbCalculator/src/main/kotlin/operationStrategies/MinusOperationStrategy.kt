package operationStrategies

class MinusOperationStrategy: MathOperationStrategy {
    override fun performOperation(leftOperand: Double, rightOperand: Double): Double {
        return leftOperand - rightOperand
    }

}