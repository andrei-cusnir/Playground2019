package Bar.People

abstract class Human() {
    abstract open val name:String
    abstract open var money:Double
    constructor(name:String,money:Double) : this()
}