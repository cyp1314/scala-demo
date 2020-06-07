object Demo13 {
  def main(args: Array[String]): Unit = {
    val hello = "hello"
    val world = "world"

    println(stract(hello)(world))
  }

  def stract(s1:String)(s2:String) ={
    s1 + " " + s2
  }
}
