object Demo2 {
  def main(args: Array[String]): Unit = {
    var z = new Array[Int](3)
    var y:Array[String] = new Array[String](5)
    z(0) = 1
    z(1) = 2
    z(2) = 3
//    z(3) = 4 # java.lang.ArrayIndexOutOfBoundsException: 3

//    println(z.size)
    for (a <- z){
      println(a)
    }

    println("-----")

    for (i <- 0 to z.size -1){
      println(z(i))
    }
  }
}
