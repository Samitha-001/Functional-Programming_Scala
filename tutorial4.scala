object tutorial4 {

//  q1
  def interest(deposit:Double): Double ={
    deposit match {
      case x if x<=20000 => deposit*0.02 + deposit
      case x if x<=200000 => deposit*0.04 + deposit
      case x if x<=2000000 => deposit*0.035 + deposit
      case x if x>2000000 => deposit*0.065 + deposit
    }
  }

//q2
def checkNum(): Unit ={
    print("Enter the number : ");
    val readNum = readLine()
    readNum.toInt match {
      case x if x<0 => println("Input is a negative value")
      case x if x==0 => println("Input is zero")
      case x if x>0 => if(x%2==0) println("Input is an even") else println("Input is an odd")
    }
  }

//q3
def toLower(name:String): String ={
  var nameLwr = ""
  for(i<-name ){
    if (i>=65 && i<=90) {
      var k = i + 32
      nameLwr += k.toChar
    }
    else {
      nameLwr+=i
    }
  }
  nameLwr
}

  def toUpper(name:String): String ={
    var nameUpr = ""
    for(i<-name) {
      if (i >= 97 && i <= 122) {
        var k = i - 32
        nameUpr += k.toChar
      } else {
        nameUpr += i
      }
    }
    nameUpr
  }

  def formatNames(name:String, func:(String)=>String, indexList: Int*): String ={
    var testStr = ""
    if(indexList.isEmpty)
      func(name)
    else{
      for(i<-0 until name.length){
        if(indexList.contains(i))
          testStr += func(name.charAt(i).toString)
        else
          testStr += name.charAt(i).toString
      }
      testStr
    }

    }


  def main(args:Array[String]): Unit ={
    println("Q1")
    println("Actual Amount : " + interest(2000))
    println("\nQ2")
    checkNum()
    println("\nQ3")
    println(formatNames("Benny",toUpper))
    println(formatNames("Niroshan",toUpper,0,1))
    println(formatNames("Saman",toLower))
    println(formatNames("Kumara",toUpper,0,5))
  }

}
