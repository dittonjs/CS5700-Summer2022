import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size

class DrawRectCommand: Command {
    override fun execute(drawing: Drawing, offset: Offset) {
        drawing.addShape(Rectangle(offset, Size(50f, 50f)))
    }
}