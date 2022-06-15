package TaxStrategy

class YourMomStrategy: TaxStrategy {
    override fun calculateTax(transactionAmount: Double): Double {
        return .17 + transactionAmount * .0001
    }
}