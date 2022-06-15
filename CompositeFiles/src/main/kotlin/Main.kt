fun main(args: Array<String>) {
    val file = File("image.jpg")
    val file2 = File("image2.jpg")
    val archive = Archive("image2.jpg")
    val folder = Folder("My Stuff")

    folder.addObject(file)
    folder.addObject(file2)

    folder.move()

}