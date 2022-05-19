import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import operationStrategies.*

class ViewHelper {
    var result by mutableStateOf(0.0)

    var userInput by mutableStateOf("")
    private val mathOperationStrategies = mapOf<String, MathOperationStrategy>(
        Pair("plus", PlusOperationStrategy()),
        Pair("minus", MinusOperationStrategy()),
        Pair("multiply", MultiplyOperationStrategy()),
        Pair("divide", DivideOperationStrategy()),
        Pair("mod", ModOperationStrategy()),
    )

    private fun getStrategy(operation: String) {

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