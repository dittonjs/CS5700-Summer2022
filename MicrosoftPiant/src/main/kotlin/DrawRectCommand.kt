import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size

class DrawRectCommand(drawing: Drawing): Command(drawing) {
    private lateinit var shape : Shape
    override fun execute(offset: Offset) {
        shape = Rectangle(offset, Size(50f, 50f))
        drawing.addShape(shape)
    }

    override fun undo(): Boolean {
        drawing.removeShape(shape)
        return true
    }
}