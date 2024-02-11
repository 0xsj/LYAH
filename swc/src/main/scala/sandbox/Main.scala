package sandbox

import cats.implicits._

object Main extends App {
  val str = "hello cats"
  val upperCaseStr = str.toUpperCase
  println("Hello " |+| "Cats!".toUpperCase)
  println(upperCaseStr)

}
