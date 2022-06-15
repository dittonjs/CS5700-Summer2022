// don't need this because using mutable lists iterator
class AccountListIterator(private val accounts: MutableList<Account>): Iterator<Account> {
    var index = 0

    override fun hasNext(): Boolean {
        return index < accounts.size
    }

    override fun next(): Account {
        return accounts[index++]
    }
}