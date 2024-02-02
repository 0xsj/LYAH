-- Define a function to square each element in a range

-- we dclare a function named squareRange, thank takes in a list of integers as input, and returns integers
squareRange :: [Int] -> [Int]

-- implementation - we use the map function to apply the lamda (\x -> x * x) to each element x in the input list xs
-- 타입스크립트로 따지면 콜백 / 익명 함수
-- xs = variable that represents the inptut list. its a convention apparently to name things like xs, ys, as
squareRange xs = map (\x -> x * x) xs

-- main function, IO() indicates that this performs I/O operations
-- has no meaningful value
main :: IO()

-- do block, 타입스크립트로 따지면 Promise. 
-- IO and Promise encapsulates side effects in a way that helps manage the flow of asynchronous or impure operations
main = do
    let result = squareRange [1..5]
    print result

{-
result = [1,4,9,16,25]

because

1 * 1 = 1
2 * 2 = 4
3 * 3 = 9
etc. 

makes sense i guess

-}
