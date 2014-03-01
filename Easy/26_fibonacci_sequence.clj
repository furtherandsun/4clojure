;Write a function which returns the first X fibonacci numbers.

;(fn fib [x]
;  (loop [cur x
;         t1 0
;         t2 1
;         xs nil]
;    (if (= cur 0)
;      (reverse xs)
;      (recur (dec cur) t2 (+ t1 t2) (conj xs t2)))))

(fn [x]
  (let [fib (fn fib [n]
              (if (< n 3)
                1
                (+ (fib (- n 1)) (fib (- n 2)))))]
    (take x (map fib (drop 1 (range))))))