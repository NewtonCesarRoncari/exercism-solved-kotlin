class Triangle<out T : Number>(a: T, b: T, c: T) {

    init {
        if (a.toDouble() <= 0 || b.toDouble() <= 0 || c.toDouble() <= 0 ||
            a.toDouble().plus(b.toDouble()) < c.toDouble() ||
            a.toDouble().plus(c.toDouble()) < b.toDouble() ||
            b.toDouble().plus(c.toDouble()) < a.toDouble()
        ) throw IllegalArgumentException()
    }

    val isEquilateral: Boolean = (a == b && b == c)
    val isIsosceles: Boolean = (b == c || a == b || c == a)
    val isScalene: Boolean = (a != b && a != c && b != c)
}
