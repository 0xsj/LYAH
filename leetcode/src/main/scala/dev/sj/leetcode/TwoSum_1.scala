package dev.sj.leetcode

object TwoSum_1 extends App {
  def solution1(nums: Array[Int], target: Int): Option[(Int, Int)] = {
    def findPair(start: Int, visited: Map[Int, Int]): Option[(Int, Int)] = {
      if(start >= nums.length) None
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

  val testCases = Seq(
    (Array(2, 7, 11, 15), 9),  // Expected: Some((0, 1))
    (Array(3, 2, 4), 6),       // Expected: Some((1, 2))
    (Array(1, 5, 7), 10),      // Expected: Some((1, 2))
    (Array(1, 3, 5, 7), 12),   // Expected: Some((2, 3))
    (Array(1, 2, 3, 4), 8)     // Expected: None
  )

  testCases.foreach { case (nums, target) =>
    println(s"nums: ${nums.mkString(", ")}, target: $target => ${solution1(nums, target)}")
  }
}
