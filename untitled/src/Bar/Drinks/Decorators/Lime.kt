package Bar.Drinks.Decorators

import Bar.Drinks.Drink

    class Lime(private val drink: Drink):DrinkDecorator{


    override fun cost(): Double {
        return drink.cost()+ 0.2
    }

        override val description: String
            get() {
                return drink.description + " with Lime"
            }
}