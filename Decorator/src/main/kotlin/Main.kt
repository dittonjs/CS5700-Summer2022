import java.lang.String.format
import kotlin.math.PI

fun printHello() {
    println("Hello")
}

fun doMath(): Double {
    return PI
}

fun toPrecision(precision: Int, callback: () -> Double): () -> Double {
    return {
        format("%.${precision}f", callback()).toDouble()
    }
}

fun doTwice(callback: () -> Unit): () -> Unit {
    return {
        callback()
        callback()
    }
}


fun main(args: Array<String>) {
    printHello()

    println("${doMath()}")
    val newPrecisionDoMath = toPrecision(4, ::doMath)

    println("${newPrecisionDoMath()}")

    val newPrintHello = doTwice(::printHello)
    newPrintHello()
}