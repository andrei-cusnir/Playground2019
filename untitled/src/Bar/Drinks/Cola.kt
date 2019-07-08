package Bar.Drinks

    class Cola(override var cost: Double, override var description: String):DrinkDecorator() {


        override fun getDescription(description: String): String {

            return super.getDescription(description)+description
        }
}