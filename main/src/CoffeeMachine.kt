import kotlin.system.exitProcess
fun main(args: Array<String>) {
    stateOfMachine.current()
    CoffeeMachine.mainMenu()
}
class CoffeeMachine {
    companion object Machine {
        //initial contents of the machine
        var availableWater = 400
        var availableMilk  = 540
        var availableBeans = 120
        var availableCups  = 9
        var availableMoney = 550
        var totalMoney     = 0

            fun mainMenu() {
                println("Write action (buy, fill, take, remaining, exit):")
                when(readLine()!!) {
                    "buy" -> BuyCoffee.TakeOrder()
                    "fill" -> fillMachine.fill()
                    "take" -> Take().GiveMoney()
                    "remaining" -> {println("The coffee machine currently has:")
                                    println(stateOfMachine.current())
                                        mainMenu()}
                    "exit" -> {println("Shutting down; the machine has ${stateOfMachine.current()} \n" +
                                        "Today you made $${totalMoney + availableMoney}! \n" +
                                        "Shutting down now.")
                                            exitProcess(0)}
                }
            }
    }
}