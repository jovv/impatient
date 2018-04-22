package impatient.chapter5

import impatient.UnitSpec

class testPerson2 extends UnitSpec {

  it should "split the name into first- and lastname" in {

    val person = new Person2("John Doe")
    person.firstName === "John"
    person.lastName === "Doe"
  }

}
