package impatient.chapter5

class BankAccount {

  private var accountBalance: Double = 0

  def withdraw(amount: Double) = {
    accountBalance -= amount
  }
  def deposit(amount: Double) = {
    accountBalance += amount
  }

  def balance = accountBalance
}
