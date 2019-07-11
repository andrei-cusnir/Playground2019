package Bar.Drinks.Soda

import Bar.Drinks.Drink

class Sprite: Drink {

    override val description: String
        get() {
            return "Sprite"
        }
    override fun cost(): Double {
        return 2.2
    }
}