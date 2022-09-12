object q3 {
  class Account(id:String, accNo:Int, b:Double){
    val nic = id
    val accountNo = accNo
    var balance = b

    def transfer(accB:Account, amount:Double): Unit = {
      this.balance -= amount
      accB.balance += amount
    }
  }

  def main(args: Array[String]): Unit ={
    var accA = new Account("123", 111, 1000)
    var accB = new Account("124", 112, 1000)

    accA.transfer(accB, 500).toString

    println("accA balance : " + accA.balance)
    println("accB balance : " + accB.balance)
  }
}
