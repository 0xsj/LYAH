package dev.sj.scala2
class disp
{
  var x = 10.3f
  var y = 7f
  def windet(): Unit = {
    println("value of x : "+x)
  }
  println("value of y : "+y)
}
object Expression {
  def main(args: Array[String]): Unit = {
    val Example = new disp()
    Example.windet()
  }
}
