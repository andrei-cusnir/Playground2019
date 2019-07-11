package Bar.Drinks.Decorators

import Bar.Drinks.Drink

abstract class DrinkDecorator(): Drink() {

        abstract override fun getDescription(): String

        override abstract fun cost():Double

    }