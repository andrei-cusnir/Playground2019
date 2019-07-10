package Bar.Drinks

    class Cola():Drink() {

        override fun cost(): Double {
            return 1.1
        }

        override fun getDescription(): String {

            var description = "Cola"
            return description
        }

}