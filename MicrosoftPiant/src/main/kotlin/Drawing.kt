import androidx.compose.runtime.mutableStateListOf

class Drawing {
    val shapes = mutableStateListOf<Shape>()

    fun addShape(shape: Shape) {
        shapes.add(shape)
    }

    fun removeShape(shape: Shape) {
        shapes.remove(shape)
    }
}