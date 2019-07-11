
import Bar.Drinks.Cola
import Bar.Drinks.Decorators.Lime
import Bar.Drinks.Drink
import Bar.People.Bartender

fun main(args: Array<String>){
    println("Hello World!")
    val bartender:Bartender
    var cola:Cola = Cola()
    println(cola.getDescription())
    var drink1:Drink = Cola()
    drink1 = Lime(drink1)
    println(drink1.getDescription())
}
