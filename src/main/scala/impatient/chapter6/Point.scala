package impatient.chapter6

object Point {
  def apply(x: Double, y: Double) = new Point(x, y)
}

class Point(val x: Double = 0, val y: Double = 0) {

}
