class Folder(name: String): FileSystemObject(name) {
    private val subFileSystemObjects = mutableListOf<FileSystemObject>()

    fun addObject(fileSystemObject: FileSystemObject) {
        subFileSystemObjects.add(fileSystemObject)
    }

    fun removeObject(fileSystemObject: FileSystemObject) {
        subFileSystemObjects.remove(fileSystemObject)
    }

    override fun delete() {
        subFileSystemObjects.forEach {
            it.delete()
        }
        super.delete()
    }

    override fun move() {
        subFileSystemObjects.forEach {
            it.move()
        }
        super.move()
    }
}