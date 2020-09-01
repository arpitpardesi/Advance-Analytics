--q1
select * from emp
where (job='Clerk' or job='manager') and DEPTNO = 20

--q2
select * from emp
where ENAME like '%R' or ENAME like '%H'

--q3

select * from emp
where SAL < 1000 and COMM is not Null

--q4

select ENAME+' is from the deptno '+cast(DEPTNO as varchar)+', earns salary '+cast(SAL as varchar) 
from EMP

--Q5

select ENAME,SAL,COMM,SAL+isNull(COMM,sal/10)	
from EMP

--q6
select ENAME, SAL, JOB, DEPTNO, case
			when deptno = 20 and job = 'Clerk' then sal+sal*0.3
			when deptno = 20 and job = 'Analyst' then sal+sal*0.5
			when deptno = 30 and job = 'Manager' then sal+sal*0.6
			when deptno = 30 and job = 'Salesman' then sal+sal*0.7
			when deptno = 10 and job = 'Clerk' then sal+sal*0.1
			else sal + 500
		end as 'Rased salary'
from EMP

--q7

select * from EMP
where (JOB = 'Clerk' and SAL >1000)
or (JOB = 'Manager' and SAL >2900)	

--q8
select ENAME, SAL, COMM, case
						when COMM is null or comm = 0 then 'Commission is not provided'
						else 'Commission is provided'
					end as 'Commision Status'
from EMP

--q9
select * from EMP
order by JOB,COMM desc

--q10
select ENAME, SAL, SAL*0.3 as "Tax and Salary" 
from EMP
where DEPTNO = 20

--q11
select * from Asia
where (YEAR(dot) = 2018
and Country = 'India' and amount >15000)
or (YEAR(dot) = 2018
and Country = 'China' and amount < 20000)
or (YEAR(dot) = 2018
and Country = 'Malaysia' and amount >40000)


--q12
select * from EMP
where JOB = 'Salesman' 
and DEPTNO = 20

--q13
select * from EMP
where MGR is Null

--q14
select * from EMP
where SAL <= 2000
order by DEPTNO, SAL desc

--q15
select ENAME, SAL, COMM, SAL+COMM*0.3 as "Total"
from EMP
where SAL-COMM <= 1200