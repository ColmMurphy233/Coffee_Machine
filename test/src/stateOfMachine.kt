object stateOfMachine {
    fun current(): String {
        return("The coffee machine has: \n" +
                "${CoffeeMachine.availableWater} of water\n" +
                "${CoffeeMachine.availableMilk} of milk\n" +
                "${CoffeeMachine.availableBeans} of coffee beans\n" +
                "${CoffeeMachine.availableCups} of disposable cups\n" +
                "${CoffeeMachine.availableMoney} of money")
    }
}