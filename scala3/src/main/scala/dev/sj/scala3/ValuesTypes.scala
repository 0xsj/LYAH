package dev.sj.scala3

object ValuesTypes extends App:
  private val x: Int = 42

  println(x)

  // must be double quotes
  val aString: String = "hello"
  val aBoolean: Boolean = true

  // chars must be single quotes
  var aChar: Char = 'a'

  val aInt: Int = x
  val anotherChar: Char = 'b'

  /**
   * you can have f, L at the end of each type to annotate
   */

  val aShort: Short = 4613
  val aLong: Long = 1928371982L
  val aFloat: Float = 2.0f
  val aDouble: Double = 3.14


  /**
   * variables
   */

  private var aVariable: Int = 4
  aVariable = 5

  println("-" * 100)
  println("\n")

  println(aVariable)

  println("\n")
  println("-" * 100)




