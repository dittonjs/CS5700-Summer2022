package TaxStrategy

interface TaxStrategy {
    fun calculateTax(transactionAmount: Double): Double
}