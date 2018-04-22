package impatient.chapter5

import impatient.UnitSpec

class testPerson extends UnitSpec {

  it should "set a negative age to zero" in {
    new Person(-5).age === 0
  }

  it should "set an age" in {
    new Person(28).age === 28
  }

}
