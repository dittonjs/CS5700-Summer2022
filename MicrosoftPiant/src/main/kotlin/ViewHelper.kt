import androidx.compose.ui.geometry.Offset

class ViewHelper(val drawing: Drawing) {
    private var command: Command = DrawRectCommand()
    fun executeCommand(offset: Offset) {
        command.execute(drawing, offset)
        Drawing.someStaticMethod()
    }

    fun setCommand(command: Command){
        this.command = command
    }
}