;Write a function which returns the Nth element from a sequence.

;(fn ny-nth [xs n]
;  (loop [xs xs
;        n n]
;    (if (= n 0)
;      (first xs)
;      (recur (rest xs) (dec n)))))

;(fn ny-nth [xs n]
;  ((vec xs) n))

;(fn ny-nth [xs n]
;  (first (drop n xs)))

#((vec %) %2)