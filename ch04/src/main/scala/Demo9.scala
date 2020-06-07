object Demo9 {
  def main(args: Array[String]): Unit = {
    println(factorial(4))
  }

  def factorial(i:Int):Int={
    def fact(i:Int,accmulator:Int):Int={
      if (i<=1){
        accmulator
      }else{
        fact(i-1,i*accmulator)
      }
    }
    fact(i,1)
  }
}
