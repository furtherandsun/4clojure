;Write a function which duplicates each element of a sequence.

;#(sort (concat % %)) ;full�sning

;(fn [xs]
;  (loop [xs xs
;         nyxs '()]
;    (if (empty? xs)
;      (reverse nyxs)
;      (recur (rest xs) (conj nyxs (first xs) (first xs))))))

#(interleave % %)