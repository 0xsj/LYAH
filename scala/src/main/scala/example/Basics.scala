// https://docs.scala-lang.org/tour/basics.html

// expressions
object Basics extends Expression with App {
  println(expressionSum)
}

trait Expression {
  lazy val expression: String = "basics"
  lazy val expressionSum: Int = 1 + 1
}
