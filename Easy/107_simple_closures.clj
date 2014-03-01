;Lexical scope and first-class functions are two of the most basic building blocks of a functional language like Clojure. When you combine the two together, you get something very powerful called lexical closures. With these, you can exercise a great deal of control over the lifetime of your local bindings, saving their values for use later, long after the code you're running now has finished.
;
;It can be hard to follow in the abstract, so let's build a simple closure. Given a positive integer n, return a function (f x) which computes xn. Observe that the effect of this is to 
;
;(fn [x]
;  (fn [y]
;    (. Math pow y x)))

(fn [n]
  #(Math/pow % n))