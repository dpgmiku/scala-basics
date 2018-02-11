

object ChallengeFour extends App {

 val b1 = new BankAccount("michal", 30.00)
  val b2 = new BankAccount("maciej", 1230.00, 'c')
 val b3 = new BankAccount("dupa", 123213.00, 's')
 println(b1)
 println(b2)
 println(b3)

  
}


class BankAccount(val name: String, val balance: Double, var accountType: Char = 'c'){
  val bankAccountId = BankAccount.newEEID()
  override def toString = "Bank Account name: " + name  + "balance: " + balance + "\nbankAccountId: " + bankAccountId + (if (accountType == 'c') "\nChecking Account"
  else "\nSavings Account")+("\n" + "="*20)
}

object BankAccount{
var accountID = 4999
  def newEEID() = {accountID +=1
    accountID
  }  
}