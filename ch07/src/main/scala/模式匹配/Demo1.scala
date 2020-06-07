package 模式匹配

object Demo1 {
  def main(args: Array[String]): Unit = {
    println(matchTest(11))
  }
  def matchTest(x:Int):String = x match {
    case 1 => "one"
    case 2 => "two"
    case _ => "many"
  }
}
