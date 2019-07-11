package Bar.Drinks.AlcoholDrinks

class Cognac: AlcoholDrink() {

    override fun alc(): Double {
        return 40.0
    }
    override val description: String
        get() {
            return "Cognac"
        }
    override fun cost(): Double {
        return 10.5
    }
}