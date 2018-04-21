import org.scalatest.FunSuite
import Chapter2._

class testChapter2 extends FunSuite {

  test ("test signum") {
    assert(signum(12) === 1)
    assert(signum(-12) === -1)
    assert(signum(0) === 0)
  }

  test ("empty block value") {
    val x = {}
    assert(x === ())
  }
  test ("empty block type") {
    val x = {}
    assert(x.isInstanceOf[Unit] === true)
  }

  test ("The stringProduct calculates the correct value") {
    assert(stringProduct("Hello") === 9415087488L)
  }

  test ("The stringProductNoLoop calculates the correct value") {
    assert(stringProductNoLoop("Hello") === 9415087488L)
  }

  test ("The stringProductRecursive calculates the correct value") {
    assert(stringProductRecursive("Hello") === 9415087488L)
  }

  test("The xToThePowerN function returns the correct result for an odd power") {
    assert(xToThePowerN(3, 3) === 27)
  }

  test("The xToThePowerN function returns the correct result for an even power") {
    assert(xToThePowerN(2, 4) === 16)
  }

  test("The xToThePowerN function returns the correct result for a negative power") {
    assert(xToThePowerN(2, -4) === 0.0625)
  }

  test("The xToThePowerN function returns the correct result when the power is zero") {
    assert(xToThePowerN(2, 0) === 1)
  }

}
