import java.util.Date

object Demo11 {
  def main(args: Array[String]): Unit = {
    var d = new Date()
    val logd = log(d.toLocaleString,_:String)

    logd("1111")
    logd("2222")
    logd("3333")
  }

  def log(date:String,msg:String)={
    println(date+"---->"+msg)
  }
}
