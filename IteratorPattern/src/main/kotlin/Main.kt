fun main(args: Array<String>) {

    println(args[0])




















    val rootAccount =
        Account("USU")
            .addAccount(
                Account("Science")
                    .addAccount(Account("ComputerScience"))
                    .addAccount(Account("Biology"))
                    .addAccount(Account("Math"))
            )
            .addAccount(
                Account("Education")
                    .addAccount(Account("Elementary Education"))
                    .addAccount(Account("Physical Education"))
            )
            .addAccount(
                Account("Engineering")
                    .addAccount(Account("Mechanical Engineering"))
                    .addAccount(Account("Electrical Engineering"))
                    .addAccount(Account("Civil Engineering"))
            )
            .addAccount(
                Account("Fine Arts")
                    .addAccount(Account("Art History"))
                    .addAccount(Account("Music"))
                    .addAccount(Account("Liberal Arts"))
            )

    for (account in rootAccount.traverse()) {
        println(account)
    }

    val school = School()
    for (account in school) {
        println(account.name)
    }
}