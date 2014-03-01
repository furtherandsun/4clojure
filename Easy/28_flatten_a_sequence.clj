;Write a function which flattens a sequence.

#(filter (complement sequential?) (rest (tree-seq sequential? seq %)))