package impatient.chapter5

// if "client code should be unaffected by our change" the values of the read-only properties
// should remain the same as well
class Time2(val hours: Int, val minutes: Int) {

  hours match {
    case h if 0 until 23+1 contains h => h
    case _ => throw new Exception("Hours should be between 0 and 23")
  }
  minutes match {
    case m if 0 until 59+1 contains m => m
    case _ => throw new Exception("Minutes should be between 0 and 23")
  }

  private val hoursAsMinutesSinceMidnight = hours * 60 - 1

  def before(other: Time2): Boolean = {
    hoursAsMinutesSinceMidnight + minutes < other.hoursAsMinutesSinceMidnight + other.minutes
  }

}
