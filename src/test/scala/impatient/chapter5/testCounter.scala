package impatient.chapter5

import impatient.UnitSpec

class testCounter extends UnitSpec {

  it should "increase a value by one" in {
    val counter = new Counter(2)
    counter.increment()
    counter.current should be (3)
  }

  it should "throw an exception when the max Int value is reached" in {

    an [Exception] should be thrownBy new Counter(Int.MaxValue).increment()

  }

}
