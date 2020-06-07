object Demo12 {

  def main(args: Array[String]): Unit = {
//    println(add2(1)(2))

    var r = add3(1)
    val i = r(2)

    println(i)
  }

  def add1(a:Int=1,b:Int)= {
    a+b
  }

  def add2(x:Int)(y:Int)={
    x+y
  }

  def add3(a:Int) = (b:Int) => a + b
}
