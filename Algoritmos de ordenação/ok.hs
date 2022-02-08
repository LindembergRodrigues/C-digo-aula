import Text.Printf
triangulo :: Double -> Double -> Double -> Double
triangulo l r b =  (2*sqrt(p * (p-r)*(p-l)*(p-b))/b)
    where p = (l+r+r)/2
        

main::IO ()
main = do
    l <- getLine
    r <- getLine
    b <- getLine
    
    let h = triangulo (read l)(read r) (read  b)
    printf "%.2f" h