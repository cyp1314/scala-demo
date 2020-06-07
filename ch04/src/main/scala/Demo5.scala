object Demo5 {
  def main(args: Array[String]): Unit = {
    test("a","b","c","d")
  }
  def test(a1:String,args:String*) = {
    println(a1)
    for (a <- args){
      println(a)
    }
  }
}
