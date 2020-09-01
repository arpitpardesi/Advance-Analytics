select 6+7 from emp
where DEPTNO = 200

select ENAME, SAL,SAL*12 as "Annual Salary" from emp --ANSI (Recommanded)

select ENAME, SAL,SAL*12 as 'Annual Salary' from emp --SSP

select ENAME, SAL,SAL*12 as [Annual Salary] from emp --SSP