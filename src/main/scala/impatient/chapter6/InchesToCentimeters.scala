package impatient.chapter6

object InchesToCentimeters extends UnitConversion {

  override def convert(unit: Double): Double = {
    unit * INCHES_TO_CENTIMERS
  }

}
