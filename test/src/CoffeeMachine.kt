import kotlin.system.exitProcess

class CoffeeMachine {
    companion object Machine {
        //initial contents of the machine
        var availableWater = 400
        var availableMilk  = 540
        var availableBeans = 120
        var availableCups  = 9
        var availableMoney = 550
        var totalMoney     = 550
            fun mainMenu() {
                println("Write action (buy, fill, take, remaining, exit):")
                when(readLine()!!) {
                    "buy" -> buyCoffee()
                    //TODO make buyCoffee class and test all this code, compare runtime to old code
                    "fill" -> fillMachine.fill()
                    "take" -> giveMoney()
                    "remaining" -> {println("The coffee machine currently has:")
                                    println(stateOfMachine.current())
                                        mainMenu()}
                    "exit" -> {println("Shutting down; the machine has ${stateOfMachine.current()} \n" +
                                        "Today you made $$totalMoney! \n" +
                                        "Shutting down now.")
                                            exitProcess(0)}
                }
            }
    }
}