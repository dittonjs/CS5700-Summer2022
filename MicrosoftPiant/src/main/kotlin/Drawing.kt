import androidx.compose.runtime.mutableStateListOf

class Drawing {
    val shapes = mutableStateListOf<Shape>()

    fun addShape(shape: Shape) {
        shapes.add(shape)
    }

    companion object {
        fun someStaticMethod() {}
    }
}