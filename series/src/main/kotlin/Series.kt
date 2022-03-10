object Series {

    fun slices(n: Int, s: String) = s.map(Char::digitToInt).run {
        require(n in 0.rangeTo(size))
        windowed(n)
    }
}
