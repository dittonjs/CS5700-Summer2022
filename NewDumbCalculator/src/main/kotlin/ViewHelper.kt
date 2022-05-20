import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import operationStrategies.*

class User(val age: Int)

class ViewHelper {
    val users = mutableListOf<User>()
    init {
        users.add(User(10))
        users.add(User(30))
        users.add(User(50))
        users.add(User(19))
        users.add(User(18))
        users.add(User(13))
        users.add(User(33))
    }
    var result by mutableStateOf(0.0)

    var userInput by mutableStateOf("")
    private val mathOperationStrategies = mapOf<String, MathOperationStrategy>(
        Pair("plus", PlusOperationStrategy()),
        Pair("minus", MinusOperationStrategy()),
        Pair("multiply", MultiplyOperationStrategy()),
        Pair("divide", DivideOperationStrategy()),
        Pair("mod", ModOperationStrategy()),
    )

    private val adults get() = users.filter { it.age >= 13 }

    fun displayAdsToUsers() {
        adults.forEach {
            // display ads
        }
    }
    // plus 2
    // divide 3
    // minus 2.4
    fun doMath() {
        val parts = userInput.split(" ")
        val intermediateResult = mathOperationStrategies[parts.first()]
            ?.performOperation(result, parts[1].toDouble()) ?: return

        result = intermediateResult
    }

}