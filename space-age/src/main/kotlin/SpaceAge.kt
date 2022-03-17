import java.math.RoundingMode

class SpaceAge(seconds: Int) {

    private val yearSecondsEarth = seconds / 31_557_600.0

    val onEarth = years()
    val onMercury = years(0.2408467)
    val onVenus = years(0.61519726)
    val onMars = years(1.8808158)
    val onJupiter = years(11.862615)
    val onSaturn = years(29.447498)
    val onUranus = years(84.016846)
    val onNeptune = years(164.79132)

    private fun years(period: Double = 1.0) =
        (yearSecondsEarth / period).toBigDecimal().setScale(2, RoundingMode.HALF_UP).toDouble()
}
