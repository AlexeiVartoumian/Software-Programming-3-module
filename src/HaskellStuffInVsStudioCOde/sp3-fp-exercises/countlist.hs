module CountList
where




countlist :: [a] -> Int
countlist x = foldl (\sum y -> sum + 1) 0 x


main :: IO ()

main = do
    let myList = [1,2,3,4,5]
    putStrLn $ "The list has " ++ show(countlist myList) ++ " elements"


