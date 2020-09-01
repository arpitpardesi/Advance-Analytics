select * from emp
--q1
select AVG(SAL) as Average ,MIN(SAL) as Minimum, MAX(SAL) as Maximum, MAX(SAL) - MIN(SAL) as Difference
from EMP

--q2
select JOB,count(ENAME) as "No. of Employees"
from EMP
group by JOB

--q3
select job from EMP
group by JOB
having min(sal) >= 3000 


--q4
select DEPTNO, COUNT(DEPTNO) as "Dept Count", CASE 
							when sum(SAL) > 10000 then 'A'
							else 'B'
						end as 'Grade'
from EMP
GROUP BY DEPTNO


--Q5
SELECT ENAME, SAL
FROM EMP
WHERE (ENAME LIKE 'A%'
OR ENAME LIKE 'S%')
and sal >= (select avg(SAL) from EMP)
--q6
select 'The total of job type '+JOB+' is '+ cast(sum(SAL) as varchar)
from EMP
group by JOB

--q7

select DEPTNO, SUM(SAL), SUM(SAL)*0.1 as "Tax:10% of Total", (SUM(SAL) - SUM(SAL)*0.1) as "Net Total: Deducting tax"	
from EMP
group by DEPTNO