class Circle(
    val radius: Double,
    val strokeColor: String,
    val strokeWidth: Int,
) {
    override fun toString(): String {
        return "R: $radius, SC: $strokeColor, SW: $strokeWidth"
    }
}