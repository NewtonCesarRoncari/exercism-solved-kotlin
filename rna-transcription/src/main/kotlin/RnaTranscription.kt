fun transcribeToRna(dna: String) = dna.map { rna[it] }.joinToString("")

private val rna = mapOf(
    'G' to 'C',
    'C' to 'G',
    'T' to 'A',
    'A' to 'U'
)
