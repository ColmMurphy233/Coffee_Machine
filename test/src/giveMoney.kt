class giveMoney {
    fun main() {
        println("I gave you ${CoffeeMachine.availableMoney}")
        CoffeeMachine.totalMoney += CoffeeMachine.availableMoney
        CoffeeMachine.availableMoney -= CoffeeMachine.availableMoney
    }
}