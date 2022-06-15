import TaxStrategy.TaxStrategy

abstract class Business(val name: String): Transactable {
    override fun performTransaction(transaction: Transaction): Double {
        // return the total for transaction plus any business specific amount
        return transaction.getTotal() // + extra stuff
    }
}

// Cowabunga
// YourMom
// ClownTown