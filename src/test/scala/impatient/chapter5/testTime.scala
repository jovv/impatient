package impatient.chapter5

import impatient.UnitSpec

class testTime extends UnitSpec {

  it should "accept the hour lower boundary values when creating an object" in {
    noException should be thrownBy new Time(0, 30)
  }

  it should "accept the hour upper boundary values when creating an object" in {
    noException should be thrownBy new Time(23, 30)
  }

  it should "accept the minute lower boundary values when creating an object" in {
    noException should be thrownBy new Time(12, 0)
  }

  it should "accept the minute upper boundary values when creating an object" in {
    noException should be thrownBy new Time(12, 59)
  }

  it should "throw an error when the hour value is not valid" in {
    an [Exception] should be thrownBy new Time(-1, 30)
  }

  it should "throw an error when the minute value is not valid" in {
    an [Exception] should be thrownBy new Time(12, 60)
  }

  it should "correctly evaluate t1 to be before t2" in {
    new Time(12, 30).before(new Time(16, 30)) === true
  }

  it should "correctly evaluate if t1 to be equal thus not before t2" in {
    new Time(12, 30).before(new Time(12, 30)) === false
  }

  it should "correctly evaluate if t1 to be greater thus not before t2" in {
    new Time(16, 59).before(new Time(16, 30)) === false
  }

}
