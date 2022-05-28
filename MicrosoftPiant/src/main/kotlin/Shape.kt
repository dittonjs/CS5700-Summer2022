import androidx.compose.ui.graphics.drawscope.DrawContext
import androidx.compose.ui.graphics.drawscope.DrawScope

abstract class Shape {
    abstract fun draw(scope: DrawScope)
}