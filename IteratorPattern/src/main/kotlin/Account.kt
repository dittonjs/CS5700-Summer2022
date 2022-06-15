class Account(val name: String) {
    private val subAccounts = mutableListOf<Account>()

    fun traverse(): Sequence<Account>  {
        return sequence {
            for (s in subAccounts) {
                yieldAll(s.traverse())
            }
            yield(this@Account)
        }
    }

    fun getIterator(): Iterator<Account> {
        return traverse().iterator()
    }

    fun addAccount(account: Account): Account {
        subAccounts.add(account)
        return this
    }
}
