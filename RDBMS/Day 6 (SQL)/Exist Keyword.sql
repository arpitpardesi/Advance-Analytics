select *
from EMP
where exists (select * from DEPT
				where DEPTNO = 77)

select *
from EMP
where exists (select 'A' from DEPT
				where DEPTNO = 20)

select * from EMP
where exists (select NULL from DEPT
				where DEPTNO = 20)


select *
from EMP
where NOT exists (select * from DEPT
				where DEPTNO = 77)

select * from EMP
where NOT exists (select NULL from DEPT
				where DEPTNO = 20)