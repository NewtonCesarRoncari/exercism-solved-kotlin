object Bob {
    fun hey(input: String) = when {
        input.isBlank() -> "Fine. Be that way!"
        isQuestion(input) && !isAllUpperCase(input) -> "Sure."
        !isQuestion(input) && isAllUpperCase(input) -> "Whoa, chill out!"
        isQuestion(input) && isAllUpperCase(input) -> "Calm down, I know what I'm doing!"
        else -> "Whatever."
    }

    private fun isQuestion(input: String) = input.trim().endsWith("?")
    private fun isAllUpperCase(input: String) =
        input.any(Char::isLetter) && input.filter(Char::isLetter).all(Char::isUpperCase)
}
