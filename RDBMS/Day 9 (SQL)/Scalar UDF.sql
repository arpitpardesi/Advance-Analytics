-- Scalar UDF

create function Annual_Sal(@p_sal int)
returns int
as
begin
return @p_sal*12
end
go

select dbo.Annual_Sal(800)

select ENAME, Job, SAL, dbo.Annual_Sal(SAL) as 'Annual Salary'
from EMP

create function try11()
returns int
as
begin
delete from EMP
return 0
end
go