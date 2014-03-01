;Given two integers, write a function which returns the greatest common divisor.

(fn [x y]
  (if (= y 0) 
    x
    (recur y (rem x y))))