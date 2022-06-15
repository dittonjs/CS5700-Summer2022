class Circle(val xPos: Int, val yPos: Int) {

    fun draw(state: ExtrinsicState) {
        println("Drawing ${state.color} circle at ($xPos, $yPos)")
    }
}