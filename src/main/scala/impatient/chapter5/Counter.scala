package impatient.chapter5

class Counter(val startValue: Int = 0) {
  private var value = startValue
  def increment() {
    println(value)
    value match {
      case Int.MaxValue  =>
        throw new Exception("Reached max value")
      case _ => value += 1
    }
  }
  def current = value
}
