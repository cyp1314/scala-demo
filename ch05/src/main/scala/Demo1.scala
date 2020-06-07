object Demo1 {
  def main(args: Array[String]): Unit = {
    println(multiplier(2))
    println(multiplier(3))
  }

  var factor = 3
  val multiplier = (i:Int) => i*factor

}
