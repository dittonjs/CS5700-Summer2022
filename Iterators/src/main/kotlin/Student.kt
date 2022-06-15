class Student(val name: String): Iterable<Account> {
    private val accounts = mutableListOf<Account>()

    fun addAccount(account: Account){
        accounts.add(account)
    }

    override fun iterator(): Iterator<Account> {
        return accounts.iterator()
    }
}