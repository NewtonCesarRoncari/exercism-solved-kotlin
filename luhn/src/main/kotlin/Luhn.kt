object Luhn {

    fun isValid(candidate: String): Boolean {
        val digits = candidate.filterNot(Char::isWhitespace)
        if (!digits.all(Char::isDigit) || digits.length <= 1) return false

        return digits.map(Char::digitToInt).reversed()
            .mapIndexed { i, n -> if (i % 2 == 1) greater9(n.plus(n)) else n }.sum() % 10 == 0
    }

    private fun greater9(int: Int) = if (int > 9) int.minus(9) else int
}
