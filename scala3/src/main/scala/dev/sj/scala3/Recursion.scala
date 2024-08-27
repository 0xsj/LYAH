package dev.sj.scala3

object Recursion extends App:
  def factorial(n: Int): Int =
    if (n <=1) 1
    else n * factorial(n -1)

  println(factorial(10))


  def anotherFactorial(n: Int): Int =
    def factorialHelper(x: Int, accumulator: Int): Int =
      if (x <= 1) accumulator
      else factorialHelper(x - 1, x * accumulator)
    factorialHelper(n, 1)


  println(anotherFactorial(5000))
