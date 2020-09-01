-- Ranking function

select ENAME, sal, RANK() over(order by sal desc) 
from EMP

select ENAME, sal, RANK() over(Partition by job order by sal desc) 
from EMP

------

select ENAME, sal, dense_RANK() over(  order by sal desc) 
from EMP

select ENAME,JOB, sal, dense_RANK() over(Partition by job  order by sal desc) 
from EMP

--------

select ROW_NUMBER() over(order by ename)  ENAME,JOB, sal 
from EMP

--------

Select *
From (select ename, deptno, sal,
Dense_Rank() Over(Partition by Deptno Order by Sal desc) as    Salary_Rank
 from emp) as DT
where Salary_Rank  = 2

--------

create view Employees_Above_Average_Salary
as
select ename, job, sal, Average_Salary, Sal - Average_Salary as "Raise"
From (select ename, job, sal, Avg(Sal) Over(Partition by job) as Average_Salary
	  from emp) as DT
where Sal > Average_Salary

select * from Employees_Above_Average_Salary