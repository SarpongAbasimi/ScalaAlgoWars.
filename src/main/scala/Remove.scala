
object Remove {
  def main(args: Array[String]): Unit = {
    val remove = new Remove;
    println(remove.accum("abc"))
  }
}

class Remove{
  def accum(s: String) = {
    val splitWord = s.split("");
    for(i <- splitWord){
      println(i)
    }
  }
}
