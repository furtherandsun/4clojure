;Write a function which returns the total number of elements in a sequence.

;(fn ny-count [l]
;  (loop [l l
;         c 0]
;    (if (empty? l)
;      c
;      (recur (rest l) (inc c)))))

#(reduce + (map (constantly 1) %))