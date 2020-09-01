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

create procedure another
as
print 'A'
Execute Show_Smith_Details

exec another

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

