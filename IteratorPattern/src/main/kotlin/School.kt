class School: Iterable<Account> {
    val accounts = mutableListOf(Account("1"), Account("2"))
    override fun iterator(): Iterator<Account> {
        return accounts.iterator()
    }
}