object Acronym {
    fun generate(phrase: String) = phrase.split(Regex("[- _]+"))
        .joinToString("") { word -> word.first().uppercase() }
}
