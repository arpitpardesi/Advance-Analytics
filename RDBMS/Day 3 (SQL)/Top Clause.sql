-- Top Clause (only for SQL Server)

select top 3 * from EMP

--FOR last 5 rows

select top 5 * 
from EMP
order by EMPNO

select top 5 sal 
from EMP
order by sal

select distinct top 5 sal 
from EMP
order by sal