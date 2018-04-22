package impatient.chapter5

class Person(val age: Int) {

  age match {
    case a if a < 0 => 0
    case _ => age
  }

}
