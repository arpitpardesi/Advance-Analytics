select * from Area
select * from Sales_Persons
select * from Item_Master
select * from Stock_Items
select * from Suppliers
select * from Transactions

use Electronics
go
--q1

select distinct SP.Salesman_Name
from Transactions T join Sales_Persons SP
on SP.Salesman_Id = T.Salesman_Id
join Area A on T.Area_Id = A.Area_Id
where A.Area_Name = 'Aundh' and t.Qty_Sold = 1

--q2 -Item_master,Sales_Persons, Transactions
select distinct IM.Item_Cost*sum(T.Qty_Sold) over() as"Total Billing amount"
from Transactions T join Sales_Persons SP
on t.Salesman_Id = SP.Salesman_Id
join Item_Master IM on T.Item_Id = IM.Item_Id
where sp.Salesman_Name = 'Pushkar'
and IM.Item_Name = 'Onida TV'

--q3 ***
select Distinct SP.Salesman_Name, A.Area_Name,sum(T.Qty_Sold) over(partition by A.Area_Id, SP.Salesman_Name) as "Quantity", sum(T.Qty_Sold) over(Partition by SP.Salesman_Name) as "Total Quantity"
from Sales_Persons SP join Transactions T
on SP.Salesman_Id = T.Salesman_Id
join Area A on A.Area_Id = T.Area_Id

--q4
select IM.Item_Name, SI.Reorder_level
from Stock_Items SI
join Item_Master IM on SI.Item_Id = IM.Item_Id
where SI.Reorder_level in (select Reorder_level from Stock_Items
						   GROUP BY Reorder_level 
						   HAVING count(Reorder_level) >1)
order by SI.Reorder_level


--q5
 select count(t.Tr_Id) as "Number of Transaction"
 from Transactions T
 Join Item_Master IM on IM.Item_Id = T.Item_Id
 where IM.Item_Cost = (select min(Item_Cost)
						from Item_Master)
 
--q6
with Running_Total as(
select Item_Id,Quantity_In_Hand, sum(Quantity_In_Hand) over(order by item_ID) as "Running total"
from Stock_Items)
select * from Running_Total
where [Running total] >200