class IsbnVerifier {

    fun isValid(number: String): Boolean {
        val isbn = number.filter { it.isDigit() || it == 'X' }
        if (isbn.length != 10 || isbn.indexOf('X') !in listOf(-1, 9)) return false

        return isbn.mapIndexed { i, c -> (if (c == 'X') 10 else c.digitToInt()) * i.plus(1) }.sum() % 11 == 0
    }
}
