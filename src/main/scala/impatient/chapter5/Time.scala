package impatient.chapter5

class Time(val hours: Int, val minutes: Int) {

  hours match {
    case h if 0 until 23+1 contains h => h
    case _ => throw new Exception("Hours should be between 0 and 23")
  }
  minutes match {
    case m if 0 until 59+1 contains m => m
    case _ => throw new Exception("Minutes should be between 0 and 23")
  }

  def before(other: Time): Boolean = {
    hours * 100 + minutes < other.hours * 100 + other.minutes
  }

}
