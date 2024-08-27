package dev.sj.leetcode

object Palindrome_9 {
  def solution1(x: Int): Boolean = {
    val numStr: String= x.toString

    def validPalindrome(start: Int, end: Int): Boolean = {
      if (start >= end) true
      else if (numStr(start) !== numStr(end)) false
      else validPalindrome(start + 1, end - 1)
    }
     validPalindrome(0, numStr.length -1)
  }
}
