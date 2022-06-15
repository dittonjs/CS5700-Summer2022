import TaxStrategy.TaxStrategy

class Transaction(val amount: Double, private val taxStrategy: TaxStrategy) {
    fun getTotal(): Double {
        return amount + taxStrategy.calculateTax(amount)
    }
}