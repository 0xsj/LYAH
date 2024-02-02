import Data.List (findIndex)


-- Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

-- You may assume that each input would have exactly one solution, and you may not use the same element twice.

-- You can return the answer in any order.

 

-- Example 1:

-- Input: nums = [2,7,11,15], target = 9
-- Output: [0,1]
-- Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
-- Example 2:

-- Input: nums = [3,2,4], target = 6
-- Output: [1,2]
-- Example 3:

-- Input: nums = [3,3], target = 6
-- Output: [0,1]
 

-- Constraints:

-- 2 <= nums.length <= 104
-- -109 <= nums[i] <= 109
-- -109 <= target <= 109
-- Only one valid answer exists.

twoSum_naive :: [Int] -> Int -> [Int] -- twosum_naive is a function that will take in a List of integers, and a integer, and ultimately return a List of integers
twoSum_naive nums target = findIndicies 0 nums -- calls a helper function findIndicies with an initial index of0 and the input list nums. 
    where
        findIndicies :: Int -> [Int] -> [Int] -- findIndicies will take in a index (i), and a list of integers to return a list of integers
        findIndicies i xs -- index i, list of integers xs
            | i == length xs = [] -- reached the end of the list base case
            | otherwise = case findIndex (== complement) (drop (i + 1) xs) of
                Just j -> [i, i + 1 + j] -- Found a pair
                Nothing -> findIndicies (i + 1) xs -- continue searching
            where
                complement = target - xs !! i

main :: IO()
main = do
    let nums1 = [2, 7, 11, 15]
        target1 = 9
        result1 = twoSum_naive nums1 target1

    putStrLn $ "Nums1: " ++ show result1

