package 单例对象

class Point(val xc: Int, val yc: Int) {
  var x: Int = xc
  var y: Int = yc
  def move(dx: Int, dy: Int) {
    x = x + dx
    y = y + dy
  }
}

object Test {
  def main(args: Array[String]) {
    val point = new Point(10, 20)

    print

    def print ={
      println(point.x)
      println(point.y)
    }
  }
}
