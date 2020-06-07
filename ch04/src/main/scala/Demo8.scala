object Demo8 {
  def main(args: Array[String]): Unit = {
    println(apply(layout,10))
  }

  def apply(f:Int => String,a:Int)=f(a)

  def layout[A](a:A) = "["+a.toString+"]"

}
