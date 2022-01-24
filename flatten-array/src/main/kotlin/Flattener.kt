object Flattener {

    fun flatten(source: Collection<Any?>): List<Int> = source.filterNotNull().flatMap {
        if (it is Int) listOf(it) else flatten(it as Collection<Any?>)
    }
}
