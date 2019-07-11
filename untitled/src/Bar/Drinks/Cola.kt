package Bar.Drinks

    class Cola:Drink {

        override val description: String
            get() {
                return "Cola"
            }
        override fun cost(): Double {
            return 2.2
        }
}