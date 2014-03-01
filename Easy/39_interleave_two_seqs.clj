;Write a function which takes two sequences and returns the first item from each, then the second item from each, then the third, etc.

;(fn [xs ys]
;  (flatten (map #(list % %2) xs ys)))

;#(apply concat (map list % %2))

mapcat list