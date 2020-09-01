--Windowing Function

select ENAME, SAL, JOB, max(SAL) over()
from emp

select ENAME, SAL, isnull(COMM,0) over()
from emp

select ENAME, SAL, JOB, max(SAL) over(Partition by job) as "Job-Wise"
from emp

select ENAME, SAL, JOB, max(SAL) over(Partition by ename) as "Job-Wise"
from emp


select trans_id, continent, country, sum(sales) over(Partition by(continent, country)) as "Sales"
from Products2
