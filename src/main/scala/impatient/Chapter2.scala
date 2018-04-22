package impatient

import java.time.LocalDate

object Chapter2 {

  def signum(n: Double): Int = {
    if (n > 0) {
      1
    } else {
      if (n < 0) {
        -1
      } else {
        0
      }
    }
  }

  def down(): Unit = {
    for (i <- Range(10, -1, -1)) {
      println(i)
    }
  }

  def down2(): Unit = {

    var i = 10
    while (i >= 0) {
      println(i)
      i -= 1
    }
  }

  def down3(): Unit = {
    for (i <- 10 to 0 by -1) {
      println(i)
    }
  }

  def countdown(n: Int): Unit = {
    for (i <- n to 0 by -1) {
      println(i)
    }
  }

  def stringProduct(s: String): Long = {

    var p: Long = 1
    for (c <- s) {
      p *= c.toInt
    }
    p
  }

  def stringProductNoLoop(s: String): Long = {
    s.foldLeft(1L)(_ * _.toInt)
  }

  def stringProductRecursive(s: String): Long = {

    s.length - 1 match {
      case 0 =>
        s.head.toInt
      case _ =>
        s.head.toInt * stringProductRecursive(s.tail)
    }

  }

  def xToThePowerN(x: Int, n: Int): Double = {

    (n, n < 0, n % 2)  match {

      case (0, _, _) => 1
      case (_, true, _) => 1 / xToThePowerN(x, n)
      case (_, _, 0) =>
        val y = xToThePowerN(x, n / 2)
        y * y
      case _ => x * xToThePowerN(x, n - 1)

    }

  }

  implicit class DateInterpolator(val sc: StringContext) extends AnyVal {
    def date(args: Any*): LocalDate = {
      if (args.length != 3) throw new Exception("Expected exactly 3 arguments")

      for (arg <- args) {
        arg match {
          case _arg: Int => _arg
          case _ => throw new Exception("Arguments should be Integers")
        }
      }

      for (part <- sc.parts) {
        if (!part.contains('-') && part.length != 1 ) throw new Exception("Separator should be a single dash.")
      }

      val year: Int = args(0).asInstanceOf[Int]
      val month: Int = args(1).asInstanceOf[Int]
      val day: Int = args(2).asInstanceOf[Int]

      LocalDate.of(year, month, day)
    }
  }

  def main(args: Array[String]): Unit = {
//    down3()
//    countdown(12)
//    println(stringProductRecursive("Hello"))
    val year = 1986
    val month = 2
    val day = 1
    val hour = 16
//    println(date"$year-$month--$day")
  }

}
