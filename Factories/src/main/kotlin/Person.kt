abstract class Person() {

    val report: Report get () = generateReport()

    protected abstract fun generateReport(): Report
}

fun getPerson(type: String): Person {
    if (type == "student") return Student()
    if (type == "faculty") return Faculty()
    if (type == "staff") return Staff()
    if (type == "administrator") return Administrator()
    throw RuntimeException("Invalid person type")
}