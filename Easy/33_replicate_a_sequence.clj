;Write a function which replicates each element of a sequence a variable number of times.

;(fn [x y]
;  (mapcat #(take y (cycle (list %))) x))

(fn [x y]
  (mapcat #(repeat y %) x))