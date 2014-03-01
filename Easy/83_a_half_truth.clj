;Write a function which takes a variable number of booleans. Your function should return true if some of the parameters are true, but not all of the parameters are true. Otherwise your function should return false.

;(fn [& xs]
;  (let [xsl (count xs)
;        xst (count (filter true? xs))]
;    (if (and (> xst 0) (< xst xsl))
;      true
;      false)))

;not=

#(even? (count (set %&)))