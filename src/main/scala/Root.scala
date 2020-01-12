object Root{
  def main(args: Array[String]): Unit = {
    val a = new Root
    println(a.a(4))
  }
}
class Root {
  def a(n: Int): BigInt = {
    if(n == 1) n else n * a(n - 1)
  }

}