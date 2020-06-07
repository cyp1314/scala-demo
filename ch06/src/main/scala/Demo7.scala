object Demo7 {
  def main(args: Array[String]): Unit = {
    val tuple = (1, 2, 3)
    tuple.productIterator.foreach(x => println(x))
  }
}
