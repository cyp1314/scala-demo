class Point(xc: Int, yc: Int) {
  var x: Int = xc
  var y: Int = yc

  def move(dx: Int, dy: Int) = {
    x = x + dx
    y = y + dy

    println("x的坐标点： " + x)
    println("y的坐标点： " + y)

  }
}

class Location(val xc: Int,
               val yc: Int,
               val zc: Int) extends Point(xc, yc) {
  var z = zc

  def move(dx: Int, dy: Int, dz: Int): Unit = {
    x = x + dx
    y = y + dy
    z = z + dz
    println("x 的坐标点 : " + x);
    println("y 的坐标点 : " + y);
    println("z 的坐标点 : " + z);
  }
}


object Demo1 {
  def main(args: Array[String]): Unit = {
    //    val point = new Point(0, 0)
    //    point.move(2, 2)
    val location = new Location(1, 1, 1)
    location.move(10, 10, 10)
  }
}
