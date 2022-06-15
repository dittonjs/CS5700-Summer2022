import androidx.compose.ui.geometry.Offset

class ViewHelper(drawing: Drawing) {
    private var noopCommand = NoopCommand(drawing)
    private var command: Command = noopCommand
    private val commandStack = mutableListOf<Command>()
    fun executeCommand(offset: Offset) {
        command.execute(offset)
        commandStack.add(0, command)
        command = noopCommand;
    }

    fun setCommand(command: Command){
        this.command = command
    }

    fun undo() {
        if (commandStack.isEmpty()) return
        var undidnt: Boolean
        do {
            undidnt = !commandStack.removeAt(0).undo()
        } while (undidnt && commandStack.isNotEmpty())
    }
}