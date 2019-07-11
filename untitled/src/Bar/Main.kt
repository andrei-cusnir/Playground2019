package Bar

import Bar.Drinks.AlcoholDrinks.AlcoholDrink
import Bar.Drinks.AlcoholDrinks.Vodca
import Bar.Drinks.Decorators.Lime
import Bar.Drinks.Drink
import Bar.Drinks.Soda.Cola
import Bar.People.Bartender
import Bar.People.Customers

fun main(args: Array<String>){
    val bartender = Bartender("Alex",150.0)
    val customer = Customers("Vasile",20.0)
    var drink:Drink = Cola()
    println("One ${drink.description} it costs ${drink.cost()}")
    drink = Lime(drink)
    println("One ${drink.description} it costs ${drink.cost()}")
    var drink1:AlcoholDrink=Vodca()
    println("${drink1.description} has ${drink1.alc()}  it is alcohol drink ${drink1.alcohol}")

}