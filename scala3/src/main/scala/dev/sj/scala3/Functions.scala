package dev.sj.scala3

object Functions extends App:
  //
  def aFunction(a: String, b: Int): String =
    a + " " + b

  println(aFunction("hello", 3))

  def noParams(): Int = 42
  println(noParams())
  println(noParams())



  def repeatedFunction(aString: String, n: Int): String =
    if (n == 1) aString
    else aString + repeatedFunction(aString, n - 1)

  println(repeatedFunction("hello", 3))

  // recursive functions. when you need loops, use recursion

  def aFunctionWithSideEffects(aString: String): Unit =
    println(aString)


  def aBigFunction(n: Int): Int =
    def aSmallerFunction(a: Int, b: Int): Int = a + b
    aSmallerFunction(n, n - 1)

  /**
   * challenges
   *
   * 1. a greeting function name, age => output statement
   * 2. factorial - 1 + 2 + 3 + 4 .... * n
   * 3. fibonnaci f = 1, f(n -1) + f(n + 2)
   * 4. function that test if number is prime.
   *
   * */


  // 1. greeting
  def greeter(name: String, age: Int): String =
    "Hi my name is" + name + "and I am " + age + "years old"

  private def factorial(n: Int): Int =
    if (n <= 1) 1
    else n * factorial(n - 1)

  println(factorial(5))

  def fibonnaci(f: Int): Int =
    if (f <=1) 1
    else fibonnaci(f - 1) + fibonnaci(f - 2)

  println(fibonnaci(8))


  def isPrime(int: Int): Boolean =
    def isPrimeUntil(t: Int): Boolean =
      if (t <= 1) true
      else int % 2 != 0 && isPrimeUntil(t- 1)
    isPrimeUntil(int / 2)

  println(isPrime(17))
  println(isPrime(17 * 29))
