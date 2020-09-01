select 6+7 from emp
where DEPTNO = 200

select ENAME, SAL,SAL*12 as "Annual Salary" from emp --ANSI (Recommanded)

select ENAME, SAL,SAL*12 as 'Annual Salary' from emp --SSP

select ENAME, SAL,SAL*12 as [Annual Salary] from emp --SSP

select * from emp
order by HIREDATE desc

select * from emp
order by Comm desc

select ENAME,DEPTNO,SAL from emp
order by DEPTNO, SAL asc

select empno, sal
from emp
order by EMPNO, sal desc

select ENAME,sal
from emp
where DEPTNO = 20
order by sal desc

select * from emp
order by 3
