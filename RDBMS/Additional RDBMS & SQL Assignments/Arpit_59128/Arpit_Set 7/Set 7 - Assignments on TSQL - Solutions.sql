select DEPTNO as "Department Number", ENAME, SAL from EMP	
where DEPTNO = 10
union
select DEPTNO,'Sub total of Deptno '+cast(DEPTNO as varchar)+'-->',sum(sal) from EMP
where DEPTNO = 10
group by DEPTNO
union
select DEPTNO as "Department Number", ENAME, SAL from EMP	
where DEPTNO = 20
union
select DEPTNO,'Sub total of Deptno '+cast(DEPTNO as varchar)+'-->',sum(sal) from EMP
where DEPTNO = 20
group by DEPTNO
union
select DEPTNO as "Department Number", ENAME, SAL from EMP	
where DEPTNO = 30
union
select DEPTNO,'Sub total of Deptno '+cast(DEPTNO as varchar)+'-->',sum(sal) from EMP
where DEPTNO = 30
group by DEPTNO
UNION 
SELECT NULL,'grand total',SUM(SAL) FROM EMP

--------------------------------------------------------

--q2
select 'Department Name '+d.DNAME as "Department-Job", sum(e.SAL) as "Total"
from emp e, dept d
WHERE E.DEPTNO = D.DEPTNO
GROUP BY D.DNAME
UNION
select 'Job Name '+JOB, SUM(SAL)
from emp
GROUP BY JOB
------------------------------------------------


select 'A',sum(sal) from emp
where year(HIREDATE) = 1981

--q3

(select ENAME as "Employee Name", convert(varchar, HIREDATE, 6) as "Joining Date", cast(SAL as varchar) as "Salary"
from EMP
where year(HIREDATE) = 1980
union all
select 'Total of 80',' ',cast(sum(SAL) over() as varchar)from EMP
where year(HIREDATE) = 1980
union all
select '****************************', ' ',' ')
union all
(select ENAME as "Employee Name", convert(varchar, HIREDATE, 6) as "Joining Date", cast(SAL as varchar) as "Salary"
from EMP
where year(HIREDATE) = 1981
union all
select 'Total of 81' ,' ',cast(sum(SAL) as varchar)from EMP
where year(HIREDATE) = 1981
union all
select '****************************', ' ',' ')
union all
(select ENAME as "Employee Name", convert(varchar, HIREDATE, 6) as "Joining Date", cast(SAL as varchar) as "Salary"
from EMP
where year(HIREDATE) = 1982
union all
select 'Total of 82' ,' ',cast(sum(SAL) as varchar)from EMP
where year(HIREDATE) = 1982
union all
select '****************************', ' ',' ')
UNION ALL
(select ENAME as "Employee Name", convert(varchar, HIREDATE, 6) as "Joining Date", cast(SAL as varchar) as "Salary"
from EMP
where year(HIREDATE) = 1983
union all
select 'Total of 83' ,' ',cast(sum(SAL) as varchar)from EMP
where year(HIREDATE) = 1983
union all
select '****************************', ' ',' ')
UNION ALL
select 'Grand total of all years' ,' ',cast(sum(SAL) as varchar)from EMP


--or
Declare @w integer
set @w = 1980
while @w <= 1983
     begin
     select t.[Employee Name],t.[Joining Date],t.Salary
	 from (
		select ENAME as "Employee Name", convert(varchar, HIREDATE, 6) as "Joining Date", cast(SAL as varchar) as "Salary", 1 as rs
	    from EMP
		where year(HIREDATE) = @w
		union
		select 'Total of '+cast(YEAR(HIREDATE) as varchar),' ',cast(sum(SAL) over() as varchar), 2 as rs from EMP
		where year(HIREDATE) = @w
		union 
		select '****************************', ' ',' ', 3 as rs
	 ) t
	 order by rs
     set @w = @w + 1
     end



create table Year_Salary(empName varchar(100),
					  joining varchar(20),
					  sal int)	

--------------------------------------------------------
--q4

(select distinct cast(DEPTNO as varchar) as 'Department Number',ENAME as 'name',cast(SAL as varchar) as 'Salary'
from emp
where DEPTNO = 10 
union all
select distinct concat(ename ,' earns the lowest salary in ',DEPTNO) as 'Department Number', ename as 'name', cast(min(sal) over(partition by deptno) as varchar )as Salary
from emp
where DEPTNO = 10
and SAl = (select min(SAL) from emp where DEPTNO = 10)
UNION all
select 'XXXXXXXXXXXXXXXXXXXXXXX', ' ', ' ' )

union all

(select distinct cast(DEPTNO as varchar) as 'Department Number',ENAME as 'name',cast(SAL as varchar) as 'Salary'
from emp
where DEPTNO = 20
union all
select distinct concat(ename ,' earns the lowest salary in ',DEPTNO) as 'Department Number', ename as 'name', cast(min(sal) over(partition by deptno) as varchar )as Salary
from emp
where DEPTNO = 20
and SAl = (select min(SAL) from emp where DEPTNO = 20)
UNION all
select 'XXXXXXXXXXXXXXXXXXXXXXX', ' ', ' ')

union all

(select distinct cast(DEPTNO as varchar) as 'Department Number',ENAME as 'name',cast(SAL as varchar) as 'Salary'
from emp
where DEPTNO = 30 
union all
select distinct concat(ename ,' earns the lowest salary in ',DEPTNO) as 'Department Number', ename as 'name', cast(min(sal) over(partition by deptno) as varchar )as Salary
from emp
where DEPTNO = 30
and SAl = (select min(SAL) from emp where DEPTNO = 30)
UNION all
select 'XXXXXXXXXXXXXXXXXXXXXXX', ' ', ' ')

union all

SELECT 'The lowest salary considering all departments is earned by '+ename ,' ', ' '
from emp 
where sal= (select min(SAL) from emp) 

-- or

Declare @w integer
set @w = 10
while @w <= 30
     begin
		select t.[Department Number],t.name,t.Salary 
		from (
			select distinct cast(@w as varchar) as 'Department Number',ENAME as 'name',cast(SAL as varchar) as 'Salary', 1 as rs 
			from emp
			where DEPTNO = @w 
			union
			select distinct concat(ename ,' earns the lowest salary in ',@w) as 'Department Number', ename as 'name', cast(min(sal) over(partition by @w) as varchar )as Salary, 2 as rs
			from emp
			where DEPTNO = @w
			and SAl = (select min(SAL) from emp where DEPTNO = @w)
			UNION
			select 'XXXXXXXXXXXXXXXXXXXXXXX', ' ', ' ',3 as rs
		) t
		order by rs

		set @w = @w + 10
	 end
SELECT 'The lowest salary considering all departments is earned by '+ename ,' ', ' '
from emp 
where sal= (select min(SAL) from emp) 


----------------------------------------------------------------------

--q5

with JobWise_Rank as(
select *, dense_rank() over(Partition by job order by SAL DESC) as "EMP_RANK"
from emp
where MGR is not NULL)
select CAST(EMPNO AS varchar), ENAME, JOB, CAST(MGR AS VARCHAR), convert(varchar, HIREDATE,6) as "HireDate", SAL, isnull(cast(COMM as varchar),' ') as "Comm",cast(DEPTNO as varchar)  from JobWise_Rank
where EMP_RANK <= 2 and job = 'Clerk'
union all
select '','','','','','','',''
UNION ALL
select CAST(EMPNO AS varchar), ENAME, JOB, CAST(MGR AS VARCHAR), convert(varchar, HIREDATE,6) as "HireDate", SAL, isnull(cast(COMM as varchar),' ') as "Comm",cast(DEPTNO as varchar)  from JobWise_Rank
where EMP_RANK <= 2 and job = 'SALESMAN'
union all
select '','','','','','','',''
UNION ALL
select CAST(EMPNO AS varchar), ENAME, JOB, CAST(MGR AS VARCHAR), convert(varchar, HIREDATE,6) as "HireDate", SAL, isnull(cast(COMM as varchar),' ') as "Comm",cast(DEPTNO as varchar)  from JobWise_Rank
where EMP_RANK <= 2 and job = 'analyst'
union all
select '','','','','','','',''
UNION ALL
select CAST(EMPNO AS varchar), ENAME, JOB, CAST(MGR AS VARCHAR), convert(varchar, HIREDATE,6) as "HireDate", SAL, isnull(cast(COMM as varchar),' ') as "Comm",cast(DEPTNO as varchar)  from JobWise_Rank
where EMP_RANK <= 2 and job = 'manager'
--------------------------------

--q6
(select cast(DEPTNO as varchar), ENAME, convert(varchar, HIREDATE,6) from EMP
where DEPTNO = 10 and HIREDATE != (select min(HIREDATE) from EMP where DEPTNO = 10)
union all
select 'The oldest employee in the deptno 10 is---------','--------------',''
union all
select top 1 cast(deptno as varchar), ENAME , convert(varchar, HIREDATE,6) 
from EMP
where DEPTNO = 10
union all
select 'XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX','XXXXXXXXXXXX', ' ')

union all
(select cast(DEPTNO as varchar), ENAME, convert(varchar, HIREDATE,6) from EMP
where DEPTNO = 20 and HIREDATE != (select min(HIREDATE) from EMP where DEPTNO = 20)
union all
select 'The oldest employee in the deptno 10 is---------','--------------',''
union all
select top 1 cast(deptno as varchar), ENAME , convert(varchar, HIREDATE,6) 
from EMP
where DEPTNO = 20
union all
select 'XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX','XXXXXXXXXXXX', ' ')

union all
(select cast(DEPTNO as varchar), ENAME, convert(varchar, HIREDATE,6) from EMP
where DEPTNO = 30 and HIREDATE != (select min(HIREDATE) from EMP where DEPTNO = 30)
union all
select 'The oldest employee in the deptno 10 is---------','--------------',''
union all
select top 1 cast(deptno as varchar), ENAME , convert(varchar, HIREDATE,6) 
from EMP
where DEPTNO = 30
union all
select 'XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX','XXXXXXXXXXXX', ' ')

union all
select 'The overall oldest employee is---------','--------------',''
union all
select top 1 cast(deptno as varchar), ENAME , convert(varchar, HIREDATE,6) 
from EMP
--------------------------------------

--q7
select 'Employees  earning less than average of Clerk are',' ' as ENAME,' ' as SAL 
UNION all
select ' ', ENAME, CAST(SAL AS varchar)
from EMP
where JOB = 'clerk'
AND SAL < (select AVG(SAL)
		   from EMP
		   where JOB = 'clerk')
UNION all
select 'Employees  earning less than average of MANAGER are',' ' as ENAME,' ' as SAL 
UNION all
select ' ', ENAME, CAST(SAL AS varchar)
from EMP
where JOB = 'MANAGER'
AND SAL < (select AVG(SAL)
		   from EMP
		   where JOB = 'MANAGER')
UNION all
select 'Employees  earning less than average of Salesman are',' ' as ENAME,' ' as SAL 
UNION all
select ' ', ENAME, CAST(SAL AS varchar)
from EMP
where JOB = 'Salesman'
AND SAL < (select AVG(SAL)
		   from EMP
		   where JOB = 'Salesman')

--------------------------

--q8
(select cast(DEPTNO as varchar), DNAME, '' as "Salary" from DEPT where DEPTNO = 10
union all
select '', ENAME, cast(SAL as varchar) from EMP where DEPTNO = 10
UNION ALL
select '','XXXXXXXXXXXXXXXXXXXXXXXXXX','')
union all
(select cast(DEPTNO as varchar), DNAME, '' as "Salary" from DEPT where DEPTNO = 20
union all
select '', ENAME, cast(SAL as varchar) from EMP where DEPTNO = 20
UNION ALL
select '','XXXXXXXXXXXXXXXXXXXXXXXXXX','')
union all
(select cast(DEPTNO as varchar), DNAME, '' as "Salary" from DEPT where DEPTNO = 30
union all
select '', ENAME, cast(SAL as varchar) from EMP where DEPTNO = 30
UNION ALL
select '','XXXXXXXXXXXXXXXXXXXXXXXXXX','')

--------------------------------------------

--q9
(select 'Accounting', 'XXXXXXXXXX' as "JOB", '' as "Highest", '' as "Lowest",'' as "Average"
union all
select '',E.JOB, CAST(max(E.SAL) AS varchar), CAST(min(E.SAL) AS varchar), CAST(avg(E.SAL) AS varchar) from EMP E join DEPT D
on E.DEPTNO =D.DEPTNO
where DNAME = 'Accounting'
group by E.JOB,D.DEPTNO)
UNION ALL
(select 'RESEARCH', 'XXXXXXXXXX' as "JOB", '' as "Highest", '' as "Lowest",'' as "Average"
union all
select '',E.JOB, CAST(max(E.SAL) AS varchar), CAST(min(E.SAL) AS varchar), CAST(avg(E.SAL) AS varchar) from EMP E join DEPT D
on E.DEPTNO =D.DEPTNO
where DNAME = 'RESEARCH'
group by E.JOB,D.DEPTNO)
UNION ALL
(select 'SALES', 'XXXXXXXXXX' as "JOB", '' as "Highest", '' as "Lowest",'' as "Average"
union all
select '',E.JOB, CAST(max(E.SAL) AS varchar), CAST(min(E.SAL) AS varchar), CAST(avg(E.SAL) AS varchar) from EMP E join DEPT D
on E.DEPTNO =D.DEPTNO
where DNAME = 'SALES'
group by E.JOB,D.DEPTNO)

-------------------------------------------

--Q10

(select 'King''s Sub-Ordinates are: ' as "Manager Details", '' as "DeptNO", '' as "Job", '' as "Salary"
union all
select ENAME, cast(DEPTNO as varchar), cast(JOB as varchar), cast(SAL as varchar) from EMP where MGR = (select EMPNO from EMP where ENAME = 'KING')
union all
select 'XXXXXXXXXXXXXXXXXXXXXXXXXXX' ,'','','')
union all
(select 'Blake''s Sub-Ordinates are: ' as "Manager Details", '' as "DeptNO", '' as "Job", '' as "Salary"
union all
select ENAME, cast(DEPTNO as varchar), cast(JOB as varchar), cast(SAL as varchar) from EMP where MGR = (select EMPNO from EMP where ENAME = 'Blake')
union all
select 'XXXXXXXXXXXXXXXXXXXXXXXXXXX' ,'','','')
union all
(select 'Scott''s Sub-Ordinates are: ' as "Manager Details", '' as "DeptNO", '' as "Job", '' as "Salary"
union all
select ENAME, cast(DEPTNO as varchar), cast(JOB as varchar), cast(SAL as varchar) from EMP where MGR = (select EMPNO from EMP where ENAME = 'Scott')
union all
select 'XXXXXXXXXXXXXXXXXXXXXXXXXXX' ,'','','')
union all
(select 'Jones''s Sub-Ordinates are: ' as "Manager Details", '' as "DeptNO", '' as "Job", '' as "Salary"
union all
select ENAME, cast(DEPTNO as varchar), cast(JOB as varchar), cast(SAL as varchar) from EMP where MGR = (select EMPNO from EMP where ENAME = 'Jones')
union all
select 'XXXXXXXXXXXXXXXXXXXXXXXXXXX' ,'','','')
union all
(select 'Clark''s Sub-Ordinates are: ' as "Manager Details", '' as "DeptNO", '' as "Job", '' as "Salary"
union all
select ENAME, cast(DEPTNO as varchar), cast(JOB as varchar), cast(SAL as varchar) from EMP where MGR = (select EMPNO from EMP where ENAME = 'Clark'))

-----------------------------------------------------

--q11
SELECT TOP 2 sal
FROM EMP
where SAL in (SELECT DISTINCT TOP 2 sal
	  FROM emp
      ORDER BY sal DESC)
ORDER BY sal desc

--q12
SELECT TOP 1 sal
FROM EMP
where SAL in (SELECT DISTINCT TOP 4 sal
	  FROM emp
	  ORDER BY sal ASC)
ORDER BY sal desc

--q13

SELECT top 2 *
FROM EMP
where SAL in (SELECT TOP 3 sal
	  FROM emp
	  ORDER BY sal desc)
ORDER BY sal
