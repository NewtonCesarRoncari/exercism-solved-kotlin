import java.time.LocalDate
import java.time.LocalDateTime
import kotlin.math.pow
import kotlin.math.roundToLong

class Gigasecond(birthDate: LocalDateTime) {
    constructor(birthDate: LocalDate) : this(birthDate.atStartOfDay())

    val date: LocalDateTime = birthDate.plusSeconds(10.0.pow(9).roundToLong())
}