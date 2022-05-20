import kotlinx.coroutines.delay

class StopWatch: Observable {
    private val observers = mutableListOf<Observer>()
    private var numSecondsPassed = 0
        set(value) {
            field = value
            notifyObservers()
        }

    private var isRunning = false;

    override fun addObserver(observer: Observer) {
        observers.add(observer)
    }

    override fun removeObserver(observer: Observer) {
        observers.remove(observer)
    }

    private fun notifyObservers() {
        observers.forEach { it.notify(numSecondsPassed) }
    }

    suspend fun start() {
//        if (isRunning) return
        isRunning = true
        while (isRunning) {
            delay(1)
            numSecondsPassed += 1
        }
    }

    fun stop() {
        isRunning = false
    }

    fun reset() {
        numSecondsPassed = 0
    }
}