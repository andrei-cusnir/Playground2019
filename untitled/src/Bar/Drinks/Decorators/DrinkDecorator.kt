package Bar.Drinks.Decorators

import Bar.Drinks.Drink

interface DrinkDecorator: Drink {

    override val description: String
    }