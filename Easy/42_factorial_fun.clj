;Write a function which calculates factorials.

;#(reduce * (range 1 (inc %)))

;* inneh�ller redan en "intern" reduce,
;ingen id� att anropa * med tv� args f�r
;hela rangen... b�ttre att applya hela rangen
;p� funktionen direkt
#(apply * (range 1 (inc %)))