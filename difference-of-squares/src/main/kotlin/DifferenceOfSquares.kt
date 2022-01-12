import kotlin.math.pow

class Squares(private val number: Int) {

    fun squareOfSum() = 1.rangeTo(number).sum().square().toInt()
    fun sumOfSquares() = 1.rangeTo(number).map(Int::square).sum().toInt()
    fun difference() = squareOfSum().minus(sumOfSquares())
}

private fun Int.square() = this.toDouble().pow(2)
