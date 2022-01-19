data class MatrixCoordinate(val row: Int, val col: Int)

class Matrix(private val rows: List<List<Int>>) {
    val saddlePoints = mutableSetOf<MatrixCoordinate>()

    init {
        rows.forEachIndexed { x, row ->
            row.forEachIndexed { y, value ->
                if (row.all { value >= it } && rows.all { value <= it[y] })
                    saddlePoints.add(MatrixCoordinate(x.plus(1), y.plus(1)))
            }
        }
    }
}
