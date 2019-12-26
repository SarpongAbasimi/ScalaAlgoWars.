object  GetMiddle {
  def main(args: Array[String]): Unit = {
    val newGetMiddle = new GetMiddle
    println(newGetMiddle.middle("Helloo"))
  }
}

class GetMiddle {
  def middle(s: String): String = {
    val middle: Int = s.length / 2
    if(!isOddOrEven(s)){
      s(middle).toString
    } else{
      s(middle - 1).toString + s(middle)
    }
  }
  private def isOddOrEven(aString: String): Boolean = {
    aString.length % 2 == 0
  }
}
