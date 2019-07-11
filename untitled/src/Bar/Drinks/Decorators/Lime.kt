package Bar.Drinks.Decorators

import Bar.Drinks.Drink

    class Lime() :DrinkDecorator() {
    constructor(drink: Drink) : this() {}


    override fun cost(): Double {
        return cost()+ 0.2
    }

    override fun getDescription(): String {
        return getDescription() + " with Lime"
    }
}