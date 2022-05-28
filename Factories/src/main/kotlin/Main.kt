fun main(args: Array<String>) {
    val people = mutableListOf<Person>()
    people.add(getPerson("student"))
    people.add(getPerson("student"))
    people.add(getPerson("student"))
    people.add(getPerson("faculty"))
    people.add(getPerson("faculty"))
    people.add(getPerson("staff"))
    people.add(getPerson("student"))
    people.add(getPerson("student"))
    people.add(getPerson("student"))
    people.add(getPerson("staff"))
    people.add(getPerson("staff"))
    people.add(getPerson("administrator"))
    people.add(getPerson("administrator"))
    people.add(getPerson("student"))
    people.add(getPerson("administrator"))

    people.forEach {
        println(it.report)
    }

}