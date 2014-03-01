;Write a function which returns true if the given sequence is a palindrome.

;Hint: "racecar" does not equal '(\r \a \c \e \c \a \r)

;(fn [x]
;  (loop [x x
;         revx (reverse x)]
;    (cond
;      (empty? x) true
;      (= (first x) (first revx)) (recur (rest x) (rest revx))
;      :else false)))

#(= (reverse %) (seq %))