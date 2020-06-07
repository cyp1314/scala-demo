class Demo1 {
  def m(x:Int) = x +3

  val f = (x:Int) => x +3
}

object Demo1Test{
  def main(args: Array[String]): Unit = {
    val m = new Demo1
    print(m.m(3)+"\n")
    println(m.f)
  }
}