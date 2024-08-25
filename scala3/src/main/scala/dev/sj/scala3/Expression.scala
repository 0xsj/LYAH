package dev.sj.scala3

object Expression extends App:
  val x = 1 + 2 // expression
  println(x)


  println(2 + 3 + 4)
  println(1 == 3)

  // logical ! && ||
  println(!(x == 4))
  println(3 != 2)


  var aVariable = 2
  aVariable += 3 // when we change the value of a variable, they are side effects
  println(aVariable)

  // instruction (DO) vs expression (VALUE)

  // if expression
  val aCondition = true
  val aConditionValue = if(aCondition) 5 else 3

  println(aConditionValue)

  // loops this is trash
//  var i = 0
//  while (i < 10)
//    println(i)
//    i += 1


//  val aWeirdValue = (aVariable = 3)
//  println(aWeirdValue)

  val codeBlock =
    val y = 2
    val z = y +  1

    // value of this entire block is the value of this last expressin.
    if (z > 2) "hello" else "goodbye"


  // 1. what is the difference between "hello world" vs println("hello world")
  val helloStr = "hello world" // this is a value - string literal
  println("hello world") // this is an expression that computes to the string hello world?

  // 2. this will evaluate to true. since the expression 2 < 3 is true.
  val someValue =
    2 < 3

  val someOtherValue =
    if(someValue) 239 else 986 // this will evaluate to true.
    // if we print this though, nothing will happen as it is other than "True"

