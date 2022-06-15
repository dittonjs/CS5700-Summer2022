class Executable(name: String): FileSystemObject(name) {

    fun execute() {
        println("Program $name was executed")
    }
}