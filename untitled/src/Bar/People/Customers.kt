package Bar.People
import Bar.Drinks.Drink

class Customers(override val name: String, override var money: Double):Human(){
    fun buyDrink(drink: Drink){

    }
}