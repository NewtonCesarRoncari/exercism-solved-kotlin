class CustomSet(vararg data: Int) {

    private val localData = data.distinct().toMutableList()

    fun isEmpty() = localData.isEmpty()

    fun isSubset(other: CustomSet) = localData.all { other.contains(it) }

    fun isDisjoint(other: CustomSet) = localData.all { !other.contains(it) }

    fun contains(other: Int) = localData.contains(other)

    fun intersection(other: CustomSet) = CustomSet(*localData.intersect(other.localData.toSet()).toIntArray())

    fun add(other: Int) = !contains(other) && localData.add(other)

    override fun equals(other: Any?) =
        if (other is CustomSet)
            localData.size == other.localData.size && localData.all { other.contains(it) }
        else false

    operator fun plus(other: CustomSet) = CustomSet(*(localData + other.localData).distinct().toIntArray())

    operator fun minus(other: CustomSet) = CustomSet(*(localData - other.localData.toSet()).toIntArray())
}
