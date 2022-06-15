class OnlineStore: Transactable {

    override fun performTransaction(transaction: Transaction): Double {
        return transaction.getTotal()
    }
}