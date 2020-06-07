import Array.range
object Demo4 {
  def main(args: Array[String]): Unit = {
    var list1 = range(1,5,2)
    for(x <- list1){
      println(x)
    }
  }
}
