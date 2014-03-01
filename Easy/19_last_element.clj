;Write a function which returns the last element in a sequence.

;(fn [l]
;  (loop [li l]
;    (if (empty? (rest li))
;      (first li)
;      (recur (rest li)))))

;(fn [l]
;  (first (reverse l)))

(comp first reverse)