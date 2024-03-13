
listSize :: [Integer] -> Integer

listSize [] = 0

listSize(curEl:restofList) = 1+ listSize restofList



-- checkSize :: ([a] -> Integer) -> Integer -> Bool

-- checkSize listSize number = number == (listSize [] 'div' 2)

increment :: Integer -> Integer

increment x = x + 1

-- checkNumber :: ([a]-> Integer) -> Integer 
-- checkNumber:: listSize = listSize/2 

-- reverseList :: [Integer] -> [Integer]
-- reverseList list = appendTillDone (fromIntegral $ listSize list) (removeTillEmpty list)

reverser :: [Integer] -> [Integer]
reverser  [] = []
reverser (x:xs) = reverser xs ++ [x] 



main ::  IO()

main = do
    let myList = [1, 2, 3, 4, 5]
  
    putStrLn  $ "this list has" ++ show(listSize myList) ++ " elements"

    putStrLn "original List"
    print myList

    putStrLn "Reverse List"
    print $ reverser myList

    