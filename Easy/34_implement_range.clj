;Write a function which creates a list of all integers in a given range.

(fn ny-range [x y]
  (loop [y (dec y)
         xs '()]
    (if (< y x)
      xs
      (recur (dec y) (cons y xs)))))