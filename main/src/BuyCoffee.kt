import java.util.*

class BuyCoffee {
    object Factory {
        fun make(water: Int, milk: Int, beans: Int, price: Int) {
            when {
                CoffeeMachine.availableWater < water -> {
                    println("Sorry, not enough water!"); CoffeeMachine.mainMenu()
                }
                CoffeeMachine.availableMilk < milk -> {
                    println("Sorry, not enough milk!"); CoffeeMachine.mainMenu()
                }
                CoffeeMachine.availableBeans < beans -> {
                    println("Sorry, not enough beans!"); CoffeeMachine.mainMenu()
                }
                CoffeeMachine.availableCups <= 0 -> {
                    println("Sorry, not enough cups!"); CoffeeMachine.mainMenu()
                }
                        CoffeeMachine.availableWater >= water &&
                        CoffeeMachine.availableMilk  >= milk  &&
                        CoffeeMachine.availableBeans >= beans &&
                        CoffeeMachine.availableCups  >= 1                   -> {
                    println("I have enough resources, making you a coffee!")
                        CoffeeMachine.availableWater -= water
                        CoffeeMachine.availableMilk  -= milk
                        CoffeeMachine.availableBeans -= beans
                        CoffeeMachine.availableCups  -= 1
                        CoffeeMachine.availableMoney += price
                        CoffeeMachine.mainMenu()
                }
            }
        }
    }
    companion object {
        fun TakeOrder() {
            println("What do you want to buy? \n" +
                    "1 - espresso \n" +
                    "2 - latte \n" +
                    "3 - cappuccino \n" +
                    "back - back to main menu:")
            when(readLine()!!) {
                "1" -> BuyCoffee.Factory.make(enums.ESPRESSO.waterPerCup,   enums.ESPRESSO.milkPerCup,   enums.ESPRESSO.beansPerCup,   enums.ESPRESSO.pricePerCup)
                "2" -> BuyCoffee.Factory.make(enums.LATTE.waterPerCup,      enums.LATTE.milkPerCup,      enums.LATTE.beansPerCup,      enums.LATTE.pricePerCup)
                "3" -> BuyCoffee.Factory.make(enums.CAPPUCCINO.waterPerCup, enums.CAPPUCCINO.milkPerCup, enums.CAPPUCCINO.beansPerCup, enums.CAPPUCCINO.pricePerCup)
                "back" -> CoffeeMachine.mainMenu()
            }
        }
    }
}