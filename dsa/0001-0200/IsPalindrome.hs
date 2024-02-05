-- // Given an integer x, return true if x is a
-- // palindrome
-- // , and false otherwise.

-- // Example 1:

-- // Input: x = 121
-- // Output: true
-- // Explanation: 121 reads as 121 from left to right and from right to left.
-- // Example 2:

-- // Input: x = -121
-- // Output: false
-- // Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
-- // Example 3:

-- // Input: x = 10
-- // Output: false
-- // Explanation: Reads 01 from right to left. Therefore it is not a palindrome.

-- // Constraints:

-- // -231 <= x <= 231 - 1

-- // Follow up: Could you solve it without converting the integer to a string?


isPalindrome_naive :: Int -> Bool
isPalindrome_naive x
    | x < 0     = False -- guar dcondition. check if input x is less than O
    | otherwise = original == reversed -- guard condition to handle where x is not negative
    where original = show x 
          reversed = reverse original

main :: IO()
main = do 
    let x = 121
        result1 = isPalindrome_naive x
    print result1
