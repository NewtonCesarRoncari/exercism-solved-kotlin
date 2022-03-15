data class Year(val year: Int) {

    val isLeap: Boolean
        get() = if (divBy(400)) true else divBy(4) && !divBy(100)

    private fun divBy(div: Int) = year.mod(div) == 0
}
