package Bar.Drinks

abstract class Drink() {


    open fun getDescription():String{
        var description = "Drink"
        return description
    }
    open abstract fun cost():Double

}