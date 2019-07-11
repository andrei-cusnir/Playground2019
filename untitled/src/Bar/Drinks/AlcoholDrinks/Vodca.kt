package Bar.Drinks.AlcoholDrinks

class Vodca: AlcoholDrink() {

    override fun alc(): Double {
        return 40.0
    }
    override val description: String
        get() {
            return "Vodca"
        }
    override fun cost(): Double {
        return 2.2
    }
}