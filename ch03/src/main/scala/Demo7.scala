object Demo7{
  def main(args: Array[String]): Unit = {
    var a = 0
    val numList = List(1,2,3,4,5,6)

    for (a <- numList
         if a % 2 == 0){
      println(a)
    }
  }
}
