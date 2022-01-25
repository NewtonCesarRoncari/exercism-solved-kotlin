object WordCount {

    fun phrase(phrase: String): Map<String, Int> =
        Regex("\\w+('\\w+)?").findAll(phrase).groupingBy { it.value.lowercase() }.eachCount()
}