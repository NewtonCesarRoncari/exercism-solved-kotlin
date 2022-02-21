object BeerSong {

    fun verses(startBottles: Int, takeDown: Int) =
        (startBottles.downTo(takeDown)).joinToString("\n") { verse(it) }

    private fun verse(amount: Int) = when (amount) {
        0 -> "No more bottles of beer on the wall, no more bottles of beer.\nGo to the store and buy some more, 99 bottles of beer on the wall.\n"
        1 -> "1 bottle of beer on the wall, 1 bottle of beer.\nTake it down and pass it around, no more bottles of beer on the wall.\n"
        2 -> "2 bottles of beer on the wall, 2 bottles of beer.\nTake one down and pass it around, 1 bottle of beer on the wall.\n"
        else -> "$amount bottles of beer on the wall, $amount bottles of beer.\nTake one down and pass it around, ${amount.minus(1)} bottles of beer on the wall.\n"
    }
}
