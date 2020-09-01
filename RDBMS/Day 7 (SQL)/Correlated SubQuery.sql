-- Correlated Sub Query

--Max sal in department
select E.* from EMP E
where sal in (select max(E1.SAL) from EMP E1
				where e.DEPTNO=e1.DEPTNO
				group by DEPTNO
		)
order by E.SAL

/*
ALTER TABLE Emp
drop column dname;

update emp
SET emp.dname = (select dname from DEPT D
				where e.DEPTNO=d.DEPTNO)
*/

select * from emp1 e
where exists (select null 
				from dept d
				where e.deptno = d.deptno)