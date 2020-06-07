abstract class Demo2 {
  def absM1(x: Int): Int
}


object add {
  def addInt(a: Int, b: Int): Int = {
    a + b
  }

  def main(args: Array[String]): Unit = {
    println(addInt(3,4))
  }
}