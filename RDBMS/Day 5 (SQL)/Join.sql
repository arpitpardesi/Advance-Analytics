/* 

	Joins

	1. Inner (Equijoin)
	2. Outer
	3. Cross (Cartesian product)

*/
--Inner
Select ename, dname, DEPT.DEPTNO
from EMP, DEPT
where EMP.DEPTNO = DEPT.DEPTNO

--or

Select ename, dname, d.DEPTNO
from EMP e, DEPT d
where e.DEPTNO = d.DEPTNO

--89
Select ename, dname, d.DEPTNO, e.SAL
from EMP e, DEPT d
where e.DEPTNO = d.DEPTNO and e.SAL>2000

--92
Select ename, dname, d.DEPTNO, e.SAL
from EMP e JOIN DEPT d
ON E.DEPTNO = D.DEPTNO
where e.SAL > 2000

-- 3 TABLES
  
  --89
Select ename, dname,pname
from e, d, p
where e.deptno = d.deptno and d.pcode=p.pcode
   
   --92
Select ename, dname, pname
from e join d
on e.deptno = d.deptno
join p
on d.pcode=p.pcode

--      Cross

Select ename, dname
from emp, dept

Select ename, dname
from emp cross join dept
select roi, month, roi*month as "Interest"
from rates CROSS join period;