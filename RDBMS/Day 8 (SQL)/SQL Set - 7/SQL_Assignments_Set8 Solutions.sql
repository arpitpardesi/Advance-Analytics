--q1
select ENAME, JOB, SAL, 
	   MAX(SAL) over(partition by Job) AS "Maximum", 
	   MIN(SAL) over(partition by Job) as "Minimum", 
	   cast(avg(sal) over(partition by job) as decimal(10,2)) as "Average"
from emp

--q2
select ENAME, DEPTNO, sal "Existing Salary", max(sal) over (partition by deptno) "Max Salary of Dept", 
(max(sal) over(partition by deptno) - sal) "Difference"
from emp
order by DEPTNO

--q3
with JobWise_Rank as(
select *, dense_rank() over(Partition by job order by SAL DESC) as "EMP_RANK"
from emp)
select * from JobWise_Rank
where EMP_RANK = 2


--q4
with HireDate_RANK as(
	select *, dense_rank() over(Partition by job order by hiredate) as "Rank"
	from emp)
select * from HireDate_RANK
where Rank = 1
--q5
with DeptWise_Rank as(
select ename, Sal, Deptno, dense_rank() over(Partition by deptno order by SAL DESC) as "EMP_RANK"
from emp)
select * from DeptWise_Rank
where EMP_RANK = 1



