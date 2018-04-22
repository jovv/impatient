package impatient.chapter5

import impatient.UnitSpec

class testbankAccount extends UnitSpec {

  def bankAccountFixture = {
    new {
      val bankAccount = new BankAccount
    }
  }

  "A new bank account" should "have a zero balance" in {
    bankAccountFixture.bankAccount.balance === 0
  }

  "Making a deposit" should "increase the account balance by the correct amount" in {
    val accountFixture = bankAccountFixture
    accountFixture.bankAccount.deposit(100.55)
    accountFixture.bankAccount.balance === 100.55
  }

  "Making a withdrawal" should "deacrease the account balance by the correct amount" in {
    val accountFixture = bankAccountFixture
    accountFixture.bankAccount.withdraw(99.95)
    accountFixture.bankAccount.balance === -99.95
  }

}
