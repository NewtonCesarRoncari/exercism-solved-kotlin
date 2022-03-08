class Dna(private val dna: String) {

    val nucleotideCounts: Map<Char, Int> = mapOf('A' to 0, 'C' to 0, 'G' to 0, 'T' to 0).run {
        require(!dna.contains(Regex("[^ACGT]")))
        plus(dna.groupingBy { it }.eachCount())
    }
}
