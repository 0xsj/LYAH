package dev.sj
package scala2




/**
 * */

object Main {
  def main(args: Array[String]): Unit = {
    println("─" * 100)


    // immutable
    val const = {
      println("Val Binding const to 1337")
      1337
    }


    println(const)
    println(const)

    println("─" * 100)


    // mutable
    var let = {
      println("Let binding to 1337")
      1337
    }

    println(let)
    println(let)


    let = {
      println("reassign 1338 to let")
      let + 1
    }

    println(let)


    let = let + 1
    let += 1

    println(let)

    println("─" * 100)

    // method
    def function  = {
      println("I'm going to behind function to 1337")
      println("but recalculate it every time")

      1337

    }

    println(function)
    println(function)

    println("─" * 100)

    lazy val mix  = {
      println("I'm going to behind function to 1337")
      println("but only on demand")

      1337
    }

    println(mix)
    println(mix)
//    println(function)


    println("─" * 100)




  }
}

