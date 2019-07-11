package Bar.Drinks.Decorators

import Bar.Drinks.Drink

class Ice(private val drink: Drink):DrinkDecorator{


    override fun cost(): Double {
        return drink.cost()+ 0.0
    }

    override val description: String
        get() {
            return drink.description + " with Ice"
        }
}