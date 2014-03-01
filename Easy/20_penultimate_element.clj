;Write a function which returns the second to last element from a sequence.

(comp second reverse)

;#(nth (reverse %) 1)

;(fn penul [li]
;  (loop [l li]
;    (if (empty? (rest (rest l)))
;      (first l)
;      (recur (rest l)))))