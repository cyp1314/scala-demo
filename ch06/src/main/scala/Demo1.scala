object Demo1 {
  val greeting:String = "Hello,World"
  var greeting2 = "Hello"

  def main(args: Array[String]): Unit = {
    println(greeting)

    val buf = new StringBuilder
    buf.append("a,")
    buf.append("b,")
    buf.append("c,")
    buf+='d'
    println(buf.toString())
    println(buf.toString().length)
  }
}
