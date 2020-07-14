object fillMachine {
    fun fill() {
        println("Write how many ml of water you want to add:")
        CoffeeMachine.availableWater += readLine()!!.toInt()

        println("Write how many ml of milk you want to add:")
        CoffeeMachine.availableMilk += readLine()!!.toInt()

        println("Write how many grams of coffee beans you want to add:")
        CoffeeMachine.availableBeans += readLine()!!.toInt()

        println("Write how many disposable cups you want to add:")
        CoffeeMachine.availableCups += readLine()!!.toInt()

        CoffeeMachine.mainMenu()
    }
}