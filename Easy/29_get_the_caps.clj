;Write a function which takes a string and returns a new string containing only the capital letters.

(fn [xs] (apply str (filter #(Character/isUpperCase %) xs)))