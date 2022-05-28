import androidx.compose.animation.core.animateOffsetAsState
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.DrawScope

class Circle(private val center: Offset, private val radius: Float): Shape() {
    override fun draw(scope: DrawScope) {
        scope.drawCircle(
            center = center,
            radius = radius,
            color = Color.Black
        )
    }
}