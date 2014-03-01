;Write a function which separates the items of a sequence by an arbitrary value.

;(fn [x y]
;  (drop-last (interleave y (repeat (count y) x))))

(fn [x y]
  (butlast (mapcat #(list % x) y)))