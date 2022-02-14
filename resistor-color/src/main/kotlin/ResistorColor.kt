object ResistorColor {

    fun colorCode(input: String) = colors().indexOf(input)

    fun colors() = listOf(
        "black",
        "brown",
        "red",
        "orange",
        "yellow",
        "green",
        "blue",
        "violet",
        "grey",
        "white",
    )
}
