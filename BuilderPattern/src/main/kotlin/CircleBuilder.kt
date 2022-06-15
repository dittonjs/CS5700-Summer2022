class CircleBuilder {
    private var radius: Double = 1.0
    private var strokeColor: String = "black"
    private var strokeWidth: Int = 1

    fun radius(radius: Double): CircleBuilder {
        this.radius = radius
        return this
    }
    fun strokeColor(color: String): CircleBuilder {
        this.strokeColor = color
        return this
    }
    fun strokeWidth(width: Int): CircleBuilder {
        this.strokeWidth = width
        return this
    }

    fun build(): Circle {
        return Circle(radius, strokeColor, strokeWidth)
    }


}