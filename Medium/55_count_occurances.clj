;Write a function which returns a map containing the number of occurences of each distinct item in a sequence.

(fn [xs]
  (reduce #(assoc %1 %2 (inc (get %1 %2 0))) {} xs))



 
