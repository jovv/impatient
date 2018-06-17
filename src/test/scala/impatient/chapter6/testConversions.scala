package impatient.chapter6

import impatient.UnitSpec
import impatient.chapter6.Conversions._

class testConversions extends UnitSpec {

  it should "convert inches to centimeters" in {
    inchesToCentimeters(3.5) === 8.89
  }

  it should "convert gallons to liters" in {
    gallonsToLiters(3.25) === 12.3025825
  }

  it should "convert miles to kilometers" in {
    milesToKilometers(4.15) === 6.678761
  }

}
