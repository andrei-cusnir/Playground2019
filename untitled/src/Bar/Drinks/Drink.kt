package Bar.Drinks

interface Drink {

    val description: String
        get() = "Unknown Drink"
    fun cost():Double
}