--Q1
select * , amount*.05 'Discounted Amount'
from India
where Qty>3
union
select * , amount*.05 'Discounted Amount'
from Australia
where Qty>3

--Q2
SELECT Pname, COUNT(Qty) AS 'Number' FROM India
group by Pname
union
select 'India Count: ',count(qty) from India
union
SELECT Pname, COUNT(Qty) AS 'Number' FROM Australia
group by Pname
union
select 'Australia Count: ', count(qty) from Australia


--Q3
SELECT 'India' as 'Country', Pname, sum(amount) AS 'Total Bill' FROM India
group by Pname
union
SELECT 'Australia' as 'Country', Pname, sum(amount) AS 'Total Bill' FROM Australia
group by Pname


--Q4
select * from India
where DOP != '1-Jan-2019'
union
select * from Australia
where DOP != '1-Jan-2019'

--Q5
select * from India
union
select * from Australia
union
select 'India',Null,Null,Null, sum(amount) from India
union
select 'Australia',Null,Null,Null, sum(amount) from Australia
order by DOP desc
--Q6
select * from India
where TrID like '%3'
union
select * from Australia
where TrID like '%3'


select TrId,DOP from India
union
select TrId,DOP from Australia
union
select 'India Count:'+cast(sum(amount) as varchar) as trid,cast('2020-08-15' as varchar) as dop  from India
union
select  'Australia Count:'+cast(sum(amount) as varchar) as trid,cast('2020-08-15' as varchar) as dop   from Australia
order by DOP