import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue

class ViewHelper: Observer {
    var numSecondsPassed by mutableStateOf(0)
    val stopWatch = StopWatch()
    init {
        stopWatch.addObserver(this)
    }

    override fun notify(numSecondsPassed: Int) {

        this.numSecondsPassed = numSecondsPassed
    }

    suspend fun start() {
        stopWatch.start()
    }

    fun stop() {
        stopWatch.stop()
    }

    fun reset() {
        stopWatch.reset()
    }


}