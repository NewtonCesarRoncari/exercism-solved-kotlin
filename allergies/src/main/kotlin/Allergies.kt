class Allergies(private var score: Int) {

    fun isAllergicTo(allergen: Allergen) = score and allergen.score != 0

    fun getList() = Allergen.values().filter(::isAllergicTo)
}
