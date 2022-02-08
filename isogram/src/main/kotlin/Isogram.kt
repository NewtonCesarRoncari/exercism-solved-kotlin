object Isogram {

    fun isIsogram(input: String): Boolean {
        val word = Regex("[a-z]").findAll(input.lowercase()).map{it.value}.toList()
        return word.toSet().size == word.size
    }
}
