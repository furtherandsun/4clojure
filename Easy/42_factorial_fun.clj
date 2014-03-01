;Write a function which calculates factorials.

;#(reduce * (range 1 (inc %)))

;* innehåller redan en "intern" reduce,
;ingen idé att anropa * med två args för
;hela rangen... bättre att applya hela rangen
;på funktionen direkt
#(apply * (range 1 (inc %)))