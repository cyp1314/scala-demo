object Demo3 {
  def main(args: Array[String]): Unit = {
    delayed(time())
  }

  def time() ={
    println("获取时间")
    System.nanoTime()
  }

  def delayed(t: => Long): Unit ={
    println("在delayed方法内执行")
    println("参数： "+t)
    t
  }
//  def delayed(t: Long): Unit ={
//    println("在delayed方法内执行")
//    println("参数： "+t)
//    t
//  }
}


