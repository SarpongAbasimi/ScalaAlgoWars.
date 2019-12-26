object SmallestInt {
  def main(args: Array[String]): Unit = {
    val list: List[Int] =  List(78,56,232,12,8)
    val s: SmallestInt = new SmallestInt
    println(s.findSmallest(list))
  }
}

class SmallestInt {
  def findSmallest(ListOfNumbers: List[Int]): Int = {
    ListOfNumbers.min
  }
}
