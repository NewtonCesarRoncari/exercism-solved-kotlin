object HandshakeCalculator {
    private val listSignal = mutableListOf<Signal>()

    fun calculateHandshake(number: Int): List<Signal> {
        listSignal.clear()

        convertToSignal(Integer.toBinaryString(number).toInt())
        return listSignal.apply { reverse() }
    }

    private fun convertToSignal(binaryString: Int) {
        when (binaryString) {
            in 1.rangeTo(9) -> {
                listSignal.add(Signal.WINK)
                convertToSignal(binaryString.minus(1))
            }
            in 10.rangeTo(99) -> {
                listSignal.add(Signal.DOUBLE_BLINK)
                convertToSignal(binaryString.minus(10))
            }
            in 100.rangeTo(999) -> {
                listSignal.add(Signal.CLOSE_YOUR_EYES)
                convertToSignal(binaryString.minus(100))
            }
            in 1000.rangeTo(9999) -> {
                listSignal.add(Signal.JUMP)
                convertToSignal(binaryString.minus(1000))
            }
            in 10000.rangeTo(99999) -> {
                convertToSignal(binaryString.minus(10000))
                listSignal.reverse()
            }
        }
    }
}
