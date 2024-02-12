// https://docs.scala-lang.org/tour/basics.html

// expressions
object Basics extends Expression with App {
  println(expressionSum)
  println(expressHello + " " + expression)
  println(x)
  println({
    val x = 1 + 2
    x + 5
    x - 8
  })

  println({
    val x = 1 * 3
    val result1 = x + 5
    val result2 = x - 5
    (result1, result2)
  })

}

trait Expression {
  lazy val expression: String = "basics"
  lazy val expressionSum: Int = 1 + 1
  lazy val expressHello: String = "hello"
  val x = 1 + 2
}
