object DoMath {
  def main(args: Array[String]): Unit = {
    println(calculate(1, 2, "add"))
  }

  def calculate(a:Float, b:Float, operator:String ): Float = {
    operator match {
      case "add" => a + b
      case "subtract" => a - b
      case "multiply" => a * b
      case "divide" => a / b
      case _ => 0
    }
  }
}
