import androidx.compose.ui.geometry.Offset

class DrawCircleCommand(drawing: Drawing): Command(drawing){
    private lateinit var shape: Shape
    override fun execute(offset: Offset) {
        shape = Circle(offset, 25f)
        drawing.addShape(shape)
    }

    override fun undo(): Boolean {
        drawing.removeShape(shape)
        return true
    }
}