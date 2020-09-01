--Derived table

select ENAME from (select ENAME, SAL,DEPTNO from EMP where DEPTNO = 20)DT


-- mainly used when a particular query is repeting again and again
select ename, sal, comm,  total, 
                   total * 0.5 as "50% Less", 
                   total * 0.4 as "40% less", 
                   total * 0.30 as "30% Less"
from (select ename, sal, comm, sal + isnull(comm, 0.50 * Sal) as total from emp) e

