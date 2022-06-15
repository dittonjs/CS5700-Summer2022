import androidx.compose.ui.geometry.Offset

abstract class Command(protected val drawing: Drawing) {
    abstract fun execute(offset: Offset)
    abstract fun undo(): Boolean
}