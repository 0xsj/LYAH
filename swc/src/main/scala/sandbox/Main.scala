package sandbox

import cats.implicits._
import JsonWriterInstances._

object Main extends App {
  val str = "hello cats"
  val upperCaseStr = str.toUpperCase
  println("Hello " |+| "Cats!".toUpperCase)
  println(upperCaseStr)

  val person = Person("John Doe", "john@example.com")
  println(person)

  // Now you can use personWriter from JsonWriterInstances
  val jsonPerson = personWriter.write(person)
  println(jsonPerson)

  val person2 = Json.toJson(Person("Dave", "dave@example.com"))
  println(person2)

}
