object CountMonkey {
  def main(args: Array[String]): Unit = {
    println(countMonkey(1))
    println(countMonkey(10))
  }

  def countMonkey(n: Int) = {
    for(i <- 1 to n) yield i
  }
}
