object q1 {
    case class Point(a:Int, b:Int){
      def x:Int = a
      def y:Int = b

      def +(p:Point): Point = Point(p.x + x, p.y + y)
      def move(dx:Int , dy:Int): Point = Point(x+dx, y+dy)
      def distance(p1:Point, p2:Point): Double = Math.sqrt(Math.pow((p2.x-p1.x),2) + Math.pow((p2.y-p1.y),2))
      def invert(p:Point): Point = Point(p.y, p.x)
    }

  def main(args: Array[String]): Unit = {
    val p1 = Point(1,2)
    println(p1+Point(0,2))
    println(p1.move(1,2))
    println(p1.distance(Point(1,1), Point(4,5)))
    println(p1.invert(Point(2,-8)))

  }



}
