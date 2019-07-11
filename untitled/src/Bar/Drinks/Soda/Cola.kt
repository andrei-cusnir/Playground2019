package Bar.Drinks.Soda

import Bar.Drinks.Decorators.DrinkDecorator
import Bar.Drinks.Drink

class Cola: Drink,DrinkDecorator {

        override val description: String
            get() {
                return "Cola"
            }
        override fun cost(): Double {
            return 2.2
        }
}