object Mumbling{
  def main(args: Array[String]): Unit = {
    val b = new Mumbling
    val c = b.accum("ab")
    println(c)
  }
}

class Mumbling {
  def accum(aString: String): String = {
    println(aString.indices)
    aString.toUpperCase.split("").zipWithIndex.map(e => (e._1 + (e._1 * (e._2)).toLowerCase)).mkString("-")
  }
}
