;Pascal's triangle is a triangle of numbers computed using the following rules:
;
;- The first row is 1.
;- Each successive row is computed by adding together adjacent numbers in the row above, and adding a 1 to the beginning and end of the row.
;
;Write a function which returns the nth row of Pascal's Triangle. 

;(fn [x]
;  (nth
;    (iterate (fn [r]
;                (vec
;                (concat [1]
;                (map #(apply + %) (partition 2 1 r))
;                [1]))) [1]) (dec x)))

(fn [x]
  (reduce #(cons (* (first %1) (/ (- x %2) %2)) %1) [1] (range 1 x)))