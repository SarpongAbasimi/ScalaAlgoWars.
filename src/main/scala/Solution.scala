object Solution {

  def main(args: Array[String]): Unit = {
    println(solution("a2323"))
  }

  def solution(word: String): List[String] = {
    word match {
      case someValue if isEven(someValue)=> {
        someValue.grouped(2).toList
      }
      case someValue if !isEven(someValue) => {
        if(someValue.size == 1) {
          someValue.toList.map(_ + "_")
        } else {
          val last = someValue.toVector.last
          val group = someValue.grouped(2).toList
          group.updated[String](group.size - 1, last + "_")
        }
      }
      case _ => Nil
    }
  }

  private val isEven = (word: String) => word.size % 2 == 0
}
