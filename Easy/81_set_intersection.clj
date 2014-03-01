;Write a function which returns the intersection of two sets. The intersection is the sub-set of items that each set has in common.

#(set (for [x % y %2 :when (= x y)] x))