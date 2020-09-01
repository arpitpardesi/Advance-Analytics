--view
select * from emp

create view emp_view as
select ENAME, JOB from EMP
where JOB = 'Clerk' 

DROP VIEW emp_view

CREATE VIEW [clerk_view] as
select EMPNO, ENAME, MGR, HIREDATE, DEPTNO from EMP
where JOB = 'clerk' 

select * from clerk_view

--inserted main table only
insert into clerk_view values
(111,'One',null,null,null)

--deleted from both
delete from clerk_view
where EMPNO = 7934

INSERT INTO EMP VALUES
        (7934, 'MILLER', 'CLERK',     7782,
        '1/23/82', 1300, NULL, 10);


create view Deptno_10_Data
as
select * from emp
where deptno = 10
WITH CHECK OPTION;

Insert Into Deptno_10_Data (Empno,Ename,Deptno) Values(1,'a',20);
Insert Into Deptno_10_Data (Empno,Ename,Deptno) Values(1,'a',10);

select * from Deptno_10_Data

create view v5 as
select deptno, max(sal) as Highest_Sal
from emp
group by deptno;

select * from v5

delete from v5

create view v6
as
select ename,dname
from emp join dept
on emp.deptno = dept.deptno

select * from v6
delete from v6