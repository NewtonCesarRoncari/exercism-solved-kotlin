object PigLatin {

    fun translate(phrase: String) = phrase.split(' ').joinToString(" ") { translateWord(it) }

    private fun translateWord(input: String) = input.run {
        if (this.contains('y') && this.length == 2)
            return "${this.substring(1)}${this.first()}ay"

        listOf("a", "e", "i", "o", "u", "yt", "ay", "xr").map {
            if (it == this.take(it.length))
                return "${this}ay"
        }
        listOf("thr", "sch", "ch", "qu", "th").map {
            if (this.substring(0.rangeTo(it.length.minus(1))) == it)
                return "${this.substring(it.length)}${it}ay"
        }

        if (this.contains('y') && this.take(2) == "rh")
            return "${this.substring(this.indexOf('y'))}${this.first()}hay"

        if (this.first() !in "aeiou"  && this.substring(1.rangeTo(2)) == "qu")
            return "${this.substring(3)}${this.first()}quay"

        if (this.first() !in "aeiou")
            return "${this.substring(1)}${this.first()}ay"
        this
    }
}
