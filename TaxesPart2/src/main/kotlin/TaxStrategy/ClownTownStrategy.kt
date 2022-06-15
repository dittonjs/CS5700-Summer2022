package TaxStrategy

class ClownTownStrategy: TaxStrategy {
    override fun calculateTax(transactionAmount: Double): Double {
        return transactionAmount * (.25 + .06)
    }

}