package impatient.chapter6

object GallonsToLiters extends UnitConversion {
  override def convert(unit: Double): Double = {
    unit * GALLONS_TO_LITERS
  }
}
