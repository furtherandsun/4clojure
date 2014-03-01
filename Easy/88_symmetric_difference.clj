;Write a function which returns the symmetric difference of two sets. The symmetric difference is the set of items belonging to one but not both of the two sets.

#(cond
  (empty? %) %2
  (empty? %2) %
  :else (apply disj (apply conj % %2) (filter % %2)))