;Convert a binary number, provided in the form of a string, to its numerical value.

(fn [xs]
  (apply + (map #(if (= %2 \1) (* 1 %) 0) (iterate #(* 2 %) 1) (reverse xs))))