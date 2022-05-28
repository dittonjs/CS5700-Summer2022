import androidx.compose.ui.geometry.Offset

class NoopCommand: Command {
    override fun execute(drawing: Drawing, offset: Offset) {}
}