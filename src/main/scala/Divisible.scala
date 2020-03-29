object Divisible {
  def main(args: Array[String]): Unit = {
    val a = new Divisible
   val c =  a.isDivisible(12,3,4)
    println(c)
  }
}
class Divisible {
  def isDivisible(n: Int, x: Int, y: Int): Boolean = {
    doesIt(n, x) && doesIt(n, y)
  }

  def doesIt(num:Int, input: Int): Boolean ={
    num % input == 0
  }
}
