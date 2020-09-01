select Pname,Qty from India
union all
select Qty, Pname from Australia

select Pname,cast(Qty as varchar ) from India
union all
select cast(Qty as varchar), Pname from Australia

select Pname from India
union all
select Pname from Australia
order by Pname

select Pname as 'ABC'
from India
union
select Pname as 'def'
from Australia

