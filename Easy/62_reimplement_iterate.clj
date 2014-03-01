;Given a side-effect free function f and an initial value x write a function which returns an infinite lazy sequence of x, (f x), (f (f x)), (f (f (f x))), etc.

(fn ny-iter [f s]
  (lazy-seq
    (cons s (ny-iter f (f s)))))