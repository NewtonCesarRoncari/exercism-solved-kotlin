object Transpose {

    fun transpose(input: List<String>): List<String> {
        if (input.isEmpty()) return emptyList()
        var line: String
        val myList = equalityLengthLines(input)

        return myList[0].mapIndexed { index, _ ->
            line = ""
            myList.map { line += it[index] }
            line.dropLastWhile { it == ' ' }.replace("-", " ")
        }
    }

    private fun equalityLengthLines(input: List<String>) = input.map { s ->
        var line = s.replace(" ", "-")
        repeat((input.maxOf { it.length }).minus(s.length)) { line += " " }
        line
    }
}