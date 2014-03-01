;Write a function which reverses a sequence.

;(fn ny-rev [xs]
;  (loop [xs xs
;         res nil]
;    (if (empty? xs)
;      res
;      (recur (rest xs) (conj res (first xs))))))

#(reduce conj '() %)