abstract class FileSystemObject(val name: String) {
    open fun move() {
        println("File $name was moved")
    }
    open fun delete() {
        println("File $name was delete")
    }
}