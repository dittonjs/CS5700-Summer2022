class IntegerDetector {
    var state: State = StartState(this)

    fun detectInt(input: String): Boolean {
        if (input.length < 8) return false
        val characters = input
            .trim()
            .split("")
            .drop(1)
            .dropLast(1)
            .toMutableList()

        for (character in characters) {
            state.consumeInput(character)
        }
        val isAccepting = state.isAccepting
        state = StartState(this)
        return isAccepting
    }

}