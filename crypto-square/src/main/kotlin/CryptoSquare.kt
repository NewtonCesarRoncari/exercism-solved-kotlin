import kotlin.math.ceil
import kotlin.math.sqrt

object CryptoSquare {

    fun ciphertext(plaintext: String): String {
        if (plaintext.isEmpty()) return plaintext

        val text = plaintext.lowercase().filter(Char::isLetterOrDigit)
        val columns = ceil(sqrt(text.length.toDouble())).toInt()
        val rectangle = makeRectangle(text.padEnd(columns * columns), columns, mutableListOf())

        return coded(rectangle, columns)
    }

    private fun coded(rectangle: MutableList<String>, numberColumn: Int) = buildString {
        List(numberColumn) { y ->
            append(" ")
            rectangle.map { append(it[y]) }
        }
    }.drop(1)

    private fun makeRectangle(text: String, columns: Int, list: MutableList<String>): MutableList<String> {
        if (text.isNotBlank()) {
            list.add(text.substring(0, columns))
            makeRectangle(text.substring(columns), columns, list)
        }
        return list
    }
}
