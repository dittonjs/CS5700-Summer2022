import TaxStrategy.ClownTownStrategy
import TaxStrategy.CowabungaStrategy
import TaxStrategy.TaxStrategy
import TaxStrategy.YourMomStrategy

fun main(args: Array<String>) {
    println(LLC("asdf").performTransaction(transactionFor(100.0, ClownTownStrategy())))
}

fun transactionFor(amount: Double, taxStrategy: TaxStrategy): Transaction {
    return Transaction(amount, taxStrategy)
}