--Table Valued function

create function fn_job_details(@p_job varchar(10))
returns table 
as
return (select * from EMP
		where job = @p_job)
--Calling TVF
select * from dbo.fn_job_details('Manager') --inline TVFx