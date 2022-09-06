object tutorial6 {
  val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

  def encrypt: (Char, Int, String) => Char = (c: Char, key: Int, a: String) =>
    a((a.indexOf(c.toUpper) + key) % a.length)

  def decrypt: (Char, Int, String) => Char = (c: Char, key: Int, a: String) =>
    a((a.indexOf(c.toUpper) - key) % a.length)

   val cipher= (func:(Char,Int,String)=> Char,s:String,key:Int,a:String)=>
    s.map(func(_,key,a))



    def main(args: Array[String]): Unit ={
        print("Enter the text : ")
        val txt = scala.io.StdIn.readLine()
        val f_txt = txt.filter(x => (x >= 65 && x <= 90) || (x>=97 && x<=122))
        print("Enter the shift value : ")
        val key = scala.io.StdIn.readInt()
      println(cipher(encrypt,f_txt, key, alphabet))

    }
}
