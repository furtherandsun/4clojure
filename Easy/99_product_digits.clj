;Write a function which multiplies two numbers and returns the result as a sequence of its digits.

(fn [x y]
  (map #(. Integer parseInt (str %)) (str (* x y))))