import Array._
object Demo3 {
  def main(args: Array[String]): Unit = {
    val a = new Array[String](3)
    a(0) = "a"
    a(1) = "b"
    a(2) = "c"

    val  b = new Array[String](2)
    b(0) = "d"
    b(1) = "e"

    val strings = a.concat(b)
    println(strings.size)

    val ss = concat(a,b)
    println(ss.size)
  }
}
