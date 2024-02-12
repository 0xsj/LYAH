// https://docs.scala-lang.org/tour/basics.html

// expressions
object Basics extends Expression with App {
  println(expression)
}

trait Expression {
  lazy val expression: String = "basics"
}
