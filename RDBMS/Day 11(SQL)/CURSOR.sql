--CURSOR
declare c1 cursor SCROLL
FOR SELECT * FROM EMP

open c1

FETCH NEXT FROM C1

fetch first  from c1

SELECT * FROM EMP

FETCH RELATIVE -3 FROM C1
-----------------------------------------
declare c2 cursor
FOR SELECT * FROM EMP
OPEN C2
FETCH NEXT FROM C2
FETCH PRIOR FROM C2

fetch first  from c2

