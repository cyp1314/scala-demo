object Demo6 {
  def main(args: Array[String]): Unit = {
    var a = 0
    val numList = List(1,2,3,4)

    for (a <- numList){
      println("Value of a: " + a)
    }
  }
}
