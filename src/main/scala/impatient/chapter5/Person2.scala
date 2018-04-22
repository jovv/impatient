package impatient.chapter5

// "val": public getter only
class Person2(val name: String) {

  val firstName: String = name.split(" ").head
  val lastName: String = name.split(" ").last

}
