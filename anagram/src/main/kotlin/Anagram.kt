class Anagram(private val source: String) {

    fun match(anagrams: Collection<String>) = anagrams.filter { word ->
        word.lowercase().toList().sorted() == source.lowercase().toList().sorted() &&
                !word.equals(source, true)
    }.toSet()
}
