;Given a function f and a sequence s, write a function which returns a map. The keys should be the values of f applied to each item in s. The value at each key should be a vector of corresponding items in the order they appear in s.

;(fn [f xs]
;  (loop [xs (reverse xs)
;         ny-map {}]
;    (if (empty? xs)
;      ny-map
;      (let [fxs (first xs)
;            ffxs (f fxs)]
;        (recur (rest xs) (assoc ny-map ffxs (vec (cons fxs (get ny-map ffxs)))))))))

(fn [f xs]
  (reduce (fn [m v]
    (let [k (f v)]
      (assoc m k (conj (get m k []) v)))) {} xs))