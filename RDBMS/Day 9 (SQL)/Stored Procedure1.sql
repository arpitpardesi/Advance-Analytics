--Stored Procedure

create procedure Show_Smith_Details
as
declare @s int
declare @j varchar(10)
select @s=sal,@j=job
from emp
where ename = 'smith'
print 'salary is '+cast(@s as varchar)
print'Job is '+@j
go
sp_helptext Show_Smith_Details

execute Show_Smith_Details

exec Show_Smith_Details

Show_Smith_Details
-----------------------------------
create procedure another
as
print 'A'
Execute Show_Smith_Details

another

--------------------------
--With parameter
create procedure Show_Job(@p_job varchar(10))
as
select * from emp
where JOB = @p_job

Show_Job 'Analyst'
------------------------------
create procedure Show_Job2(@p_job varchar(10) = 'Manager')
as
select * from emp
where JOB = @p_job

Show_Job2
Show_Job2 'Analyst'

create procedure P8(@name varchar(50),@salary integer output)
as
select @salary = sal
from EMP
where ENAME = @name

declare @v_sal int
Execute P8 'Smith', @v_sal output --output keyword mandatory
select @v_sal

