
import Bar.Drinks.Soda.Cola
import Bar.Drinks.Decorators.Lime
import Bar.Drinks.Drink
import Bar.People.Bartender

fun main(args: Array<String>){
    println("Hello World!")
    val bartender:Bartender
    var cola: Cola = Cola()
    println(cola.description)
    var drink1:Drink = Cola()
    drink1 = Lime(drink1)
    println(drink1.description)
}
