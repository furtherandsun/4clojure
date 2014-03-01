; Map is one of the core elements of a functional programming language. Given a function f and an input sequence s, return a lazy sequence of (f x) for each element x in s.

;(fn ny-map [f xs]
;  (lazy-seq
;    (when-let [xs (seq xs)]
;      (cons (f (first xs)) (ny-map f (rest xs))))))

(fn ny-map [f [x & xs]]
  (if x
    (cons (f x) (lazy-seq (ny-map f xs)))))