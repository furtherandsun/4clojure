; Write a predicate which checks whether or not a given sequence represents a binary tree. Each node in the tree must have a value, a left child, and a right child.

(fn tree-check [xs]
  (odd?
    (count (filter #(not (false? %)) (flatten xs)))))