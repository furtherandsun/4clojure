;Write a function which will split a sequence into two parts.

;#(list (take % %2) (nthnext %2 %))

(fn [n xs]
  [(take n xs) (drop n xs)])