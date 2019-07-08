package Bar.People

class Bartender(override val name: String, override var money: Double) :Human(name = "Alex", money = 100.50) {
    fun greetings(){
        println("Hello my dear customers")
    }
    fun sellDrinks(){}
}