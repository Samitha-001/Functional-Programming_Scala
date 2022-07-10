object tutorial2_2 {
    def main(args: Array[String]): Unit ={

      var g = 4.0f

      var a: Int = 2
      var b: Int = 3
      var c: Int = 4
      var d: Int = 5
      var k: Float = 4.3f

      println((b-1)*a + (c*d))
      println(a)
      a+=1
      println(-2*(g-k)+c)
      println(c)
      println((c+1)*a)
      a+=1


      //q4-a
      def normal_total(hours: Double): Double = {
        val normal_cost = 250
        hours * normal_cost
      }
      def ot_total(hours: Double): Double ={
        val ot_cost = 85
        hours * ot_cost
      }
      def home_salary(normal: Double, ot:Double, tax: Double): Double ={
        (normal_total(normal) + ot_total(ot)) * (1-tax)
      }
      println("Salary : "+home_salary(40, 30, 0.12))

      //q4- b
      def attendees_count(ticketPrice: Double): Double = {
        120 + (15- ticketPrice)/5 * 20
      }
      def revenue(ticketPrice: Double): Double ={
        ticketPrice  *attendees_count(ticketPrice)
      }
      def cost(ticketPrice:Double): Double ={
        val price = 500
        price + 3*attendees_count(ticketPrice)
      }
      def profit(ticketPrice: Double): Double ={
        revenue(ticketPrice)-cost(ticketPrice)
      }
      println("Attendees :" + attendees_count(10))
      println("Revenue :" + revenue(10))
      println("Cost :" + cost(10))
      println("Profit :" + profit(10))
    }

}
