import java.io.File
import java.util
import java.util.Scanner

import scala.collection.mutable
import scala.collection.SortedMap
import scala.collection.JavaConversions.{mapAsScalaMap, propertiesAsScalaMap}
import scala.collection.immutable.ListMap

object Chapter4 extends App {

  def gizmos(): Unit = {

    val stuff = Map("iphone" -> 350, "gloomhaven" -> 150, "bike" -> 550)
    val discount = mutable.Map[String, Double]()
    for ((k, v) <- stuff) discount += (k -> v*0.9)

    println(discount)
  }

  def countWords() = {
    val words = mutable.Map[String, Int]()
    val in = new Scanner(new File("./src/main/resources/ch4_words.txt"))
    while (in.hasNext()) {
      val k = in.next()
      words.get(k) match {
        case Some(w) => words(k) = words(k) + 1
        case None => words += (k -> 1)
      }

    }
    println(words)
  }

  def countWordsImmutable() = {
    var words = Map[String, Int]()
    val in = new Scanner(new File("./src/main/resources/ch4_words.txt"))
    while (in.hasNext()) {
      val k = in.next()
      words.get(k) match {
        case Some(i) =>
          words += (k -> (i + 1))
        case None => words += (k -> 1)
      }

    }
    println(words)
  }

  def countWordsSorted() = {
    var words = SortedMap[String, Int]()
    val in = new Scanner(new File("./src/main/resources/ch4_words.txt"))
    while (in.hasNext()) {
      val k = in.next()
      words.get(k) match {
        case Some(i) =>
          words += (k -> (i + 1))
        case None => words += (k -> 1)
      }

    }
    println(words)
  }

  def countWordsSortedTree() = {
    var words: mutable.Map[String, Int] = new util.TreeMap[String, Int]()
    val in = new Scanner(new File("./src/main/resources/ch4_words.txt"))
    while (in.hasNext()) {
      val k = in.next()
      words.get(k) match {
        case Some(i) =>
          words += (k -> (i + 1))
        case None => words += (k -> 1)
      }

    }
    println(words)
  }

  def weekdays() = {
    val days = mutable.LinkedHashMap(
      "monday" -> java.util.Calendar.MONDAY,
      "tuesday" -> java.util.Calendar.TUESDAY,
      "wednesday" -> java.util.Calendar.WEDNESDAY,
      "thursday" -> java.util.Calendar.THURSDAY,
      "friday" -> java.util.Calendar.FRIDAY,
      "saturday" -> java.util.Calendar.SATURDAY,
      "sunday" -> java.util.Calendar.SUNDAY)

    for ((k, v) <- days) println(k, v)
  }

  def printProps() = {
    val props: scala.collection.Map[String, String] = System.getProperties
    val propsSorted = ListMap(props.toSeq.sortWith(_._1.length > _._1.length):_*)

    val padLength = propsSorted.head._1.length + 2
    println(padLength)

    for ((k, v) <- props) {
      println(s"${k.padTo(padLength, ' ')} | $v")
    }

  }

  def minmax(a: Array[Int]): Tuple2[Int, Int] = {
    (a.min, a.max)
  }

  def lteqgt(a: Array[Int], v: Int): Tuple3[Int,Int,Int] = {
    (a.count(_ < v), a.count(_ == v), a.count(_ > v))
  }

  def zipEx() = {
    println("Hello".zip("World"))
  }

  //gizmos()
  //countWords()
  //countWordsSorted()
  //countWordsSortedTree()
  //printProps()
  //println(minmax(Array(2, 4, 16, -1)))
  //println(lteqgt(Array(2, 4, 16, -1), 3))
  //zipEx()

}
