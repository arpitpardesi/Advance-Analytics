--NUll Handlinh

select ename, sal, comm, sal+isnull(comm,0) as total
from EMP
--ANSI SQL
select ename, sal, comm, sal+coalesce(comm,0) as total
from EMP

select coalesce(null,null,null,80,null,null,100)

--NullIf
select NullIf(1,1)
select NullIf(1,2)
select NullIf(Null,2)