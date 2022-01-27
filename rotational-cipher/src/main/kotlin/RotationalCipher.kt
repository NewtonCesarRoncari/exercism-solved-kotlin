class RotationalCipher(private val number: Int) {
    private val alphabet = ('a'.rangeTo('z')).toList()

    fun encode(text: String): String = text.map { c ->
        when {
            c.isLowerCase() -> letter(c)
            else -> if (c.isLetter()) letter(c.lowercaseChar()).uppercase() else c
        }
    }.joinToString("")

    private fun letter(c: Char) = alphabet[(alphabet.indexOf(c).plus(number)) % alphabet.size]
}
