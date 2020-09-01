select * from EMP
where sal> (select AVG(sal) 
      from EMP 
	  where JOB = 'Clerk')

select ename, sal, job, avg(sal), sal - avg(sal)
from emp
group by ename, sal, job

--Display the name, sal, deptno, highest sal and difference of employees 
--who are earning sal less than the highest of their own deptno

SELECT a.ENAME, a.SAL, a.DEPTNO, b.MaxSal, (b.MaxSal - a.SAL) as "Difference" 
from EMP a join (select DEPTNO, max(sal) as MaxSal 
					   from EMP 
					   group by DEPTNO) b
on a.DEPTNO=b.DEPTNO
WHERE a.sal<b.MaxSal

--------4TH HIGHEST SAL
SELECT * FROM EMP
WHERE SAL = (select min(SAL)
from (select distinct top 4 sal from EMP order by sal desc) abc
)
