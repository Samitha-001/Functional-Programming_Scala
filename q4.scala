object q4 {
  class Account(id:String, accNo:Int, b:Double){
    val nic = id
    val accountNo = accNo
    var balance = b

    def transfer(accB:Account, amount:Double): Unit = {
      this.balance -= amount
      accB.balance += amount
    }

    override def toString = "Account No.:  " + accountNo + ", " + "NIC: " + nic + ", Balance: " + balance + "\n"

  }

  def main(args: Array[String]): Unit ={
    var bank:List[Account] = List()
    var accA = new Account("123", 111, 1000)
    var accB = new Account("124", 112, -1000)
    var accC = new Account("125", 113, 10000)
    var accD = new Account("126", 114, 1000)
    var accE = new Account("127", 115, 0)
    var accF = new Account("128", 116, -10)
    bank = List(accA, accB, accC, accD, accE, accF)

    def checkNegativeBalance(acc: List[Account]): String= {
      acc.filter(x => x.balance < 0).toString
    }
    def sumAll(account: List[Account]): Double ={
      account.map(x => x.balance).sum
    }
    def interestAdded(account: List[Account]): String ={
      account.map(x => {if (x.balance>=0) x.balance+ x.balance*0.05 else x.balance+x.balance*0.1}).toString()
    }

    println("Negative balances " + checkNegativeBalance(bank))
    println("Sum of all accounts : " + sumAll(bank))
    println("After calculating interests : " + interestAdded(bank))
  }

}
