fun main(args: Array<String>) {
    val detector = IntegerDetector()

    println(detector.detectInt("123"))
    println(detector.detectInt("0123"))
    println(detector.detectInt("123a4"))
    println(detector.detectInt("123234985723495872345"))
    println(detector.detectInt("1"))
    println(detector.detectInt("0"))
    println(detector.detectInt(""))

    val b = "/a/"
}