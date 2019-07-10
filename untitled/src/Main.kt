
import Bar.Drinks.Cola
import Bar.People.Bartender

fun main(args: Array<String>){
    println("Hello World!")
    val bartender:Bartender
    var cola:Cola = Cola()
    println(cola.getDescription())
}