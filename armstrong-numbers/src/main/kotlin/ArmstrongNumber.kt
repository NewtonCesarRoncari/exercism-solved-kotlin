import kotlin.math.pow

object ArmstrongNumber {

    fun check(input: Int) = "$input".run {
        sumOf { eachNumber -> eachNumber.digitToInt().toDouble().pow(length).toInt() } == input
    }
}