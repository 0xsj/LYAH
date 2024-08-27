package dev.sj.leetcode

object TwoSum_1 extends App {


  def time[R](block: => R): (R, Long) = {
    val start = System.nanoTime()
    val res = block
    val end = System.nanoTime()
    (res, end - start)
  }


  def solution1(nums: Array[Int], target: Int): Option[(Int, Int)] = {
    def findPair(start: Int, visited: Map[Int, Int]): Option[(Int, Int)] = {
      if (start >= nums.length) None
      else {
        val current = nums(start)
        val complement = target - current

        visited.get(complement) match {
          case Some(index) => Some((index, start))
          case None =>
            findPair(start + 1, visited + (current -> start))
        }
      }
    }

    findPair(0, Map.empty)
  }

  // bad immutable
  def solution2(nums: Array[Int], target: Int): Array[Int] = {
    val indexMap = scala.collection.mutable.Map[Int, Int]()

    for (i <- nums.indices) {
      val current = nums(i)
      val complement = target - current

      if (indexMap.contains(complement)) {
        return Array(indexMap(complement), i)
      }

      indexMap(current) = i
    }
    Array()
  }

  def solution3(nums: Array[Int], target: Int): Array[Int] = {
    nums.zipWithIndex.foldLeft(Map.empty[Int, Int]) { case (acc, (num, i)) =>
      val complement = target - num
      acc.get(complement) match {
        case Some(j) => return Array(j, i)
        case None => acc + (num -> i)
      }
    }

    Array()
  }

  val testCases = Seq(
    (Array(2, 7, 11, 15), 9), // Expected: Some((0, 1))
    (Array(3, 2, 4), 6), // Expected: Some((1, 2))
    (Array(1, 5, 7), 10), // Expected: Some((1, 2))
    (Array(1, 3, 5, 7), 12), // Expected: Some((2, 3))
    (Array(1, 2, 3, 4), 8) // Expected: None
  )

  testCases.foreach { case (nums, target) =>
    val (result1, time1) = time {
      solution1(nums, target)
    }
    println(s"Solution 1 - nums: ${nums.mkString(", ")}, target: $target => $result1, time: $time1 ns")

    val (result2, time2) = time {
      solution2(nums, target)
    }
    println(s"Solution 2 - nums: ${nums.mkString(", ")}, target: $target => ${result2.mkString(", ")}, time: $time2 ns")

    val (result3, time3) = time {
      solution3(nums, target)
    }
    println(s"Solution 3 - nums: ${nums.mkString(", ")}, target: $target => ${result3.mkString(", ")}, time: $time3 ns")

    println("----------")
  }
}
