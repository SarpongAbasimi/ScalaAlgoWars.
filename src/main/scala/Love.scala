object Love{
  def main(args: Array[String]): Unit = {
    val l: Love = new Love
    print(l.loveFunc(2,4))
  }

}
class Love {
  def loveFunc(flowerOne: Int, flowerTwo: Int): Boolean = {
    if((flowerOne + flowerTwo) % 2 == 0) false else true
  }
}
