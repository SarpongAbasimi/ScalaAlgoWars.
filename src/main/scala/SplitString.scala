object SplitString {
  def main(args: Array[String]): Unit = {
    println(solution("abc"))
  }

  def solution(word: String): List[String] = {
    evenOrOld(word) match {
      case true =>
    }
  }

  private def evenOrOld(word: String): Boolean = {
    word match {
      case word.length % 2 == 0 => true
      case word.length % 2 != 0 => false
      case _ => false
    }

  }
}
