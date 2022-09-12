object q1 {
  class rational(x:Int, y:Int){

    def numer:Int = x
    def denom:Int = y

    def neg = new rational(-this.numer, this.denom)

    def printOut(): Unit ={
      println(numer + "/" + denom)
    }
  }

  def main(args: Array[String]): Unit ={
    var x = new rational(1,2)
    x.neg.printOut()
  }
}
