import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.DrawScope

class Rectangle(private val position: Offset, private val size: Size): Shape() {
    override fun draw(scope: DrawScope) {
        scope.drawRect(
            topLeft = position,
            size = size,
            color = Color.Black
        )
    }
}