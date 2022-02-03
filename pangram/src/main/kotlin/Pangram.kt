object Pangram {

    fun isPangram(input: String) = ('a'..'z').all { char -> char in input.lowercase() }
}
