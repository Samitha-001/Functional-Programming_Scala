object q2 {

  class rational(x:Int, y:Int){

    def numer:Int = x
    def denom:Int = y

    def -(r:rational) = new rational(this.numer *
      r.denom  - r.numer * this.denom, denom * r.denom)

    def printOut(): Unit ={
      println(numer + "/" + denom)
    }
  }

  def main(args:Array[String]): Unit = {
    var a = new rational(3,4)
    var b = new rational(5,8)
    var c = new rational(2,7)

    (a-b-c).printOut()
  }

}
