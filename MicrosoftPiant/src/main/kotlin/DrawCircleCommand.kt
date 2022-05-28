import androidx.compose.ui.geometry.Offset

class DrawCircleCommand: Command {
    override fun execute(drawing: Drawing, offset: Offset) {
        drawing.addShape(Circle(offset, 25f))
    }
}