--case

--1. Switch Case

select ENAME,job,CASE JOB
					WHEN 'CLERK' THEN 100
					when 'manager' then 600
					END AS "Points"
from EMP

--2. If Else

--CORRECT BUT LOGICALLY WRONG
select ENAME,job,sal,CASE 
					WHEN SAL >=4500 THEN 'A'
					WHEN SAL >=2500 THEN 'B'
					WHEN SAL >=2000 THEN 'C'
					WHEN SAL >=1000 THEN 'D'
					else 'E'
					END AS "Points"
from EMP

--CORRECT
select ENAME,job,sal,CASE 
					WHEN SAL BETWEEN 4500 AND 10000 THEN 'A'
					WHEN SAL BETWEEN 2000 AND 4500 THEN 'B'
					WHEN SAL BETWEEN 1000 AND 2000 THEN 'C'
					WHEN SAL BETWEEN 500 AND 1000 THEN 'D'
					else 'E'
					END AS "Points"
from EMP


select ENAME,job,sal,CASE 
					WHEN (SAL BETWEEN 0 AND 999) AND ENAME LIKE 'S%' THEN 1
					WHEN (SAL BETWEEN 0 AND 999) AND ENAME LIKE 'J%' THEN 2
					else 3
					END AS "Points"
from EMP