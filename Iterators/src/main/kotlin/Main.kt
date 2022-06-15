
fun visitor(context: Account.AccountVisitorContext): String {
    println(context)
    return ""
}

fun main(args: Array<String>) {
    val rootAccount =
        Account("USU")
            .addAccount(
                Account("Science")
                    .addAccount(Account("ComputerScience"))
                    .addAccount(Account("Biology"))
                    .addAccount(Account("Math"))
            ).addAccount(
                Account("Engineering")
                    .addAccount(Account("Mechanical Engineering"))
                    .addAccount(Account("Electrical Engineering"))
                    .addAccount(Account("Civil Engineering"))
            ).addAccount(
                Account("Fine Arts")
                    .addAccount(Account("Music"))
                    .addAccount(Account("Pottery"))
            ).addAccount(
                Account("Business")
                    .addAccount(Account("Business Admin"))
                    .addAccount(Account("MIS"))
                    .addAccount(Account("Accounting"))
                    .addAccount(Account("Marketing"))
            )

    rootAccount.visit {
        println("${"".padStart(it.depth, ' ')}${it.account.name}")
    }

    rootAccount.visit(::visitor)


}