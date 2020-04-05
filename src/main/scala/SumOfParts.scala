import scala.collection.mutable.ListBuffer

object SumOfParts {
  def main(args: Array[String]): Unit = {
    val s = Seq(0, 1, 3, 6, 10)
    println(sum(s))
  }

  def sum(seqOfNumbers: Seq[Int]) : Seq[Int] = {
    seqOfNumbers.scanRight(0)(_ + _)
  }
}
