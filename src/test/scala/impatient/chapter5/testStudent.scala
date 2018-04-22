package impatient.chapter5

import impatient.UnitSpec
import impatient.chapter5

class testStudent extends UnitSpec {

  it should "make no difference to call the Java Beans properties or Scala properties" in {

    val student = new Student

    student.getName() == student.name
    student.getId() == student.id
  }

}
