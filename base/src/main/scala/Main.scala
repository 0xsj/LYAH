/*
* @args
*/
object Main {
  def main(args: Array[String]): Unit = {
    println("-" * 100)
    println(args.mkString(
      start = "Array(",
      sep = ", ",
      end = ")"
      )
    )

    val const = {
      println("I'm going to bind const to 1337")

      1337
    }

    println(const)
    println(const)
    println("-" * 100)

    var let = {
      println("I'm going to bind const to 1337")

      1337
    }

    println(let)
    println(let)
    println("-" * 100)

    let = {
      println("1338 assigned to let")
      let + 1
    }

    println(let)
    println(let)
    println("-" * 100)


    def function = {
      println("1338 assigned to let")
      println("but recalculate it every time.")

      1337
    }

    println(function)
    println(function)
    println("-" * 100)


    lazy val mix = {
      println("I'm going to beind mix to 1337")
      println("only when it is used")

      1337
    }

    println(mix)
    println(mix)



    println("-" * 100)
  }
}
