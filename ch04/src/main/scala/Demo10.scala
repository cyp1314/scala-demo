object Demo10 {
  def main(args: Array[String]): Unit = {
    var x = inc(1, 2)
    println(x)
  }

  var inc = (a: Int, b: Int) => a + b
}
