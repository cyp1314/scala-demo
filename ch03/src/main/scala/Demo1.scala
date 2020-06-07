object Demo1 {
  def main(args: Array[String]): Unit = {

    var a = 5;

    if (a > 5) {
      print("a大于5")
    }

    if (a > 5){
      print("a大于5")
    } else {
      print("a小于5")
    }

    if (a == 5){
      print("a 等于5")
    }else if (a == 10){
      print("a 等于 10")
    }else if (a == 100){
      print("a 等于 100")
    } else {
      print("我不知道了...")
    }

  }
}
