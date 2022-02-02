object BinarySearch {
    fun search(list: List<Int>, item: Int) = findElement(list, 0, list.size.minus(1), item)

    private fun findElement(list: List<Int>, first: Int, last: Int, item: Int): Int {
        if (first > last || list.isEmpty()) throw NoSuchElementException()
        val root = (first.plus(last)) / 2

        return when {
            item > list[root] -> findElement(list, root.plus(1), last, item)
            item < list[root] -> findElement(list, first, root.minus(1), item)
            else -> root
        }
    }
}
