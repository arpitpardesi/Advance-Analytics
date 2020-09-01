--Recursive CTE

with CTE(id, bill) 
as (select 
		id = 1,
		bill=1001
		union all
		select 
		id+1,
		bill+1
		from CTE
		where id<3000)



insert into CTE_R
select * from CTE
option (maxrecursion 0)

select * from CTE_R
create table CTE_R
(ID int,BILL int)

delete from CTE_R

drop table CTE_R