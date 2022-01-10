class Matrix(private val matrixAsString: String) {

    fun column(colNr: Int): List<Int> = matrixAsString.lines()
        .map { row -> row.trim().split("\\s+".toRegex())[colNr.minus(1)].toInt() }

    fun row(rowNr: Int): List<Int> = matrixAsString.lines()[rowNr.minus(1)]
        .split("\\s+".toRegex()).map(String::toInt)
}
