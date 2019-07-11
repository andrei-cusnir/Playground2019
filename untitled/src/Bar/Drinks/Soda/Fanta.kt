package Bar.Drinks.Soda

import Bar.Drinks.Drink

class Fanta: Drink {

    override val description: String
        get() {
            return "Fanta"
        }
    override fun cost(): Double {
        return 2.2
    }
}