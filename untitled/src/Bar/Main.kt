package Bar

import Bar.Drinks.Cola
import Bar.Drinks.Decorators.Lime
import Bar.Drinks.Drink
import Bar.People.Bartender
import Bar.People.Customers

fun main(args: Array<String>){
    val bartender = Bartender("Alex",150.0)
    val customer = Customers("Vasile",20.0)
    var drink:Drink = Cola()
    println("One ${drink.description} it costs ${drink.cost()}")
    drink = Lime(drink)
    println("One ${drink.description}")
}