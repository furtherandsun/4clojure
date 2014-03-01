;Write a function which drops every Nth item from a sequence.

;(fn [x y]
;  (mapcat #(if (= y (count %)) (butlast %) %) (partition-all y x)))

(fn [x y]
  (mapcat #(take (dec y) %) (partition-all y x)))