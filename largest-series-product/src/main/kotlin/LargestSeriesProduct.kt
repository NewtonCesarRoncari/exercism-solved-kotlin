class Series(private val input: String) {

    init {
        require(input.all(Char::isDigit))
    }

    fun getLargestProduct(span: Int): Long {
        require(0 <= span && span <= input.length)
        if (span == 0) return 1

        return input.map(Char::digitToInt)
            .windowed(span) { it.reduce { acc, current -> acc * current } }.maxOf(Int::toLong)
    }
}
