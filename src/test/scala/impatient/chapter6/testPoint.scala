package impatient.chapter6

import impatient.UnitSpec

class testPoint extends UnitSpec {

  it should "create a point" in {
    val p = Point(1.5, 3.75)

    p.x === 1.5
    p.y === 3.75
  }

}
