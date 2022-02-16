class DiamondPrinter {

    private val structure = mutableListOf<String>()
    private val alphabet = ('A'..'Z').toList()

    fun printToList(c: Char): List<String> {
        val diamond = makeDiamond(alphabet.indexOf(c), alphabet.indexOf(c), alphabet.indexOf(c)).toMutableList()
        structure.removeLast()
        diamond.addAll(structure.reversed())

        return diamond
    }

    private fun makeDiamond(length: Int, charPlace1: Int, charPlace2: Int, charIndex: Int = 0): List<String> {
        val line = (0.rangeTo(length * 2)).joinToString("") { " " }.toCharArray()
        line[charPlace1] = alphabet[charIndex]
        line[charPlace2] = alphabet[charIndex]
        structure.add(line.joinToString(""))

        return if (line.first().isLetter()) structure else
            makeDiamond(length, charPlace1.minus(1), charPlace2.plus(1), charIndex.plus(1))
    }
}
