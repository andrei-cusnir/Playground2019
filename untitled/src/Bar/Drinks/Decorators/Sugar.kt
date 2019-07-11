package Bar.Drinks.Decorators

import Bar.Drinks.Drink

class Sugar(private val drink: Drink):DrinkDecorator{


    override fun cost(): Double {
        return drink.cost()+ 0
    }

    override val description: String
        get() {
            return drink.description + " cup of Sugar"
        }
}