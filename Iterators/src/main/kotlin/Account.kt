class Account(var name: String): Iterable<Account> {
    val subAccounts = mutableListOf<Account>()

    data class AccountVisitorContext(val account: Account, val depth: Int)

    private fun traverse(): Sequence<Account> {
        return sequence {
            yield(this@Account)
            for(subAccount in subAccounts) {
                yieldAll(subAccount.traverse())
            }
        }
    }

    fun addAccount(account: Account): Account {
        subAccounts.add(account)
        return this
    }

    override fun iterator(): Iterator<Account> {
        return traverse().iterator()
    }

    fun visit(visitor: (context: AccountVisitorContext) -> Unit) {
        visit(this, visitor, 0)
    }

    private fun visit(account: Account, visitor: (context: AccountVisitorContext) -> Unit, depth: Int) {
        visitor(AccountVisitorContext(account, depth))
        for (subAccount in account.subAccounts) {
            visit(subAccount, visitor, depth + 1)
        }
    }
}