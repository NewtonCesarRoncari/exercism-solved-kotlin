object RunLengthEncoding {

    fun encode(input: String) = input.replace("(.)\\1+".toRegex()) { matcher ->
        matcher.value.length.toString() + matcher.groupValues[1]
    }

    fun decode(input: String) = input.replace("(\\d+)(.)".toRegex()) { matcher ->
        matcher.groupValues[2].repeat(matcher.groupValues[1].toInt())
    }
}
