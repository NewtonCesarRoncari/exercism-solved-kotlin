object Raindrops {

    fun convert(n: Int) = buildString {
        mapOf(3 to "Pling", 5 to "Plang", 7 to "Plong").map { if (n % it.key == 0) this.append(it.value) }
        return this.toString().ifEmpty { n.toString() }
    }
}
