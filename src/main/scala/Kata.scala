object Kata{
  def main(args: Array[String]): Unit = {
    val list: List[Int] = List(2,3,4,5)
    val h: Kata = new Kata
    println(h.maps(list))
  }
}

class Kata {
  def maps(xs: List[Int]): List[Int] ={
    xs.map(_ * 2)
  }
}
