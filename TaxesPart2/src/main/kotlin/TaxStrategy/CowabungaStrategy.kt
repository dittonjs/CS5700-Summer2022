package TaxStrategy

import kotlin.math.PI

class CowabungaStrategy: TaxStrategy {
    override fun calculateTax(transactionAmount: Double): Double {
        return transactionAmount * (PI/100.0)
    }

}