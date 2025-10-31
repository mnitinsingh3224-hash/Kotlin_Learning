class BankAccount {
    private var balance: Double = 0.0
    private var accountHolder:String = ""


    // Setter
    fun setAccountHolder(name:String) {
        if (name.isNotEmpty()) {
            accountHolder = name
        } else {
            println("apna naam dale")
        }

    }

    // Getter
    fun getAccountHolder(): String {
        return accountHolder
    }

    fun deposit(amount: Double) {
        if (amount > 0) {
            balance += amount
        } else {
            println("Amount positive hona chhaye")
        }
    }

    fun getBalance(): Double {
        return balance
    }
}

fun main() {
    val bankAccount = BankAccount()
    bankAccount.setAccountHolder("Nitin Singh")
    println("Account Holder : ${bankAccount.getAccountHolder()}")

    bankAccount.deposit(3455.34)
    println("Current Balnce is : ${bankAccount.getBalance()}")
}