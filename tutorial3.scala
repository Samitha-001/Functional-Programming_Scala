object tutorial3 {

  //q1
  def areaOfDisk(r: Double) ={
    Math.PI*r*r
  }

  //q2
  def celToF(temp: Double): Double ={
    temp*1.8 + 32
  }
  //q3
  def volume(r: Double):Double={
    (4*Math.PI*r*r*r)/3
  }
  //q4
  def bookPrice(price: Double, noOfCovers: Int): Double = price*noOfCovers*(1-0.4)
  def shipping(noOfCopies: Int): Double= {
    if (noOfCopies <= 50)
      noOfCopies * 3
    else
      (noOfCopies - 50) * 0.75 + 3 * 50
  }

  //q5
  def easyPace(km: Double): Double ={
      val rate = 8
      km*rate
    }
  def tempo(km: Double): Double = {
    val rate = 7
    km * rate
  }

    def main(args:Array[String]): Unit ={
      //q1
      println("Q1")
      println("Area of the disk : " + areaOfDisk(5))
      println("\n")
      //q2
      println("Q2")
      println(celToF(26) + " celcius")
      println("\n")
      //q3
      println("Q3")
      println("Volume of the sphere : " + volume(5))
      println("\n")
      //q4
      println("Q4")
      print("Total Cost : ")
      println(bookPrice(24.95, 60) + shipping(60))
      println("\n")
      //q5
      println("Q5")
      print("Total minutes : ")
      println(easyPace(2) + tempo(3) + easyPace(2))
    }

}
