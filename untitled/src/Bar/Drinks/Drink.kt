package Bar.Drinks

abstract class Drink() {

    abstract var cost:Double
    abstract var description:String

    open fun getDescription(description: String):String{
        return description
    }

}