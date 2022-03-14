object RomanNumerals {

    private val romans = mapOf(
        "M" to 1000, "CM" to 900,
        "D" to 500, "CD" to 400,
        "C" to 100, "XC" to 90,
        "L" to 50, "XL" to 40,
        "X" to 10, "IX" to 9,
        "V" to 5, "IV" to 4,
        "I" to 1,
    )

    fun value(value: Int): String {
        var n = value
        return romans.map {
            it.key.repeat(n / it.value).apply { if (n >= 0) n -= (it.value * (n / it.value)) }
        }.joinToString("")
    }
}
