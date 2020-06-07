object Demo6 {
  def main(args: Array[String]): Unit = {
    val a = Map("a" -> "aa", "b" -> "bb", "c" -> "cc")
    //    println( a.get("c").get)

    a.keys.foreach(i => {
      println("key:" + i)
      println("value:" + a(i))
    }
    )
  }
}
