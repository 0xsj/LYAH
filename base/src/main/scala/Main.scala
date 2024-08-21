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


    println("-" * 100)
  }
}
