package impatient.chapter6

object MilesToKilometers extends UnitConversion {
  override def convert(unit: Double): Double = {
    unit * MILES_TO_KILOMETERS
  }
}
