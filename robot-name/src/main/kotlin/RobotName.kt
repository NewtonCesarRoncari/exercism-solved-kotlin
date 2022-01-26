class Robot {
    var name: String = randomName()

    fun reset() {
        name = randomName()
    }

    private fun randomName(): String {
        val randomName = ('A'..'Z').map { it }.shuffled().subList(0, 2)
            .joinToString("").plus((100..999).random())

        if (usedNames.contains(randomName)) return randomName()
        inputName(randomName)
        return randomName
    }

    private companion object {
        val usedNames = mutableSetOf<String>()
        fun inputName(name: String) = usedNames.add(name)
    }
}
