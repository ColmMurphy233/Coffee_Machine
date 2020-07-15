class Take {
    fun GiveMoney() {
        println("I gave you ${CoffeeMachine.availableMoney}")
        CoffeeMachine.totalMoney += CoffeeMachine.availableMoney
        CoffeeMachine.availableMoney -= CoffeeMachine.availableMoney
        CoffeeMachine.mainMenu()
    }
}