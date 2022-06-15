import androidx.compose.ui.geometry.Offset

class NoopCommand(drawing: Drawing): Command(drawing) {
    override fun execute(offset: Offset) {}
    override fun undo(): Boolean {
        return false
    }
}