--q1
Declare @w integer
set @w = 31
while @w <= 98
begin
    print @w * 7+'-';
    set @w = @w + 1;
end;
----------------------------
--q2
Declare SalCheck Cursor


--q3


--q4
create table Emp_Coupons
			(Name varchar(90),
			Coupon_No int)
insert into Emp_Coupons values ('John',80)
insert into Emp_Coupons values ('Martin',83)
insert into Emp_Coupons values ('Allen',87)
insert into Emp_Coupons values ('Roger',78)
insert into Emp_Coupons values ('Adams',88)
insert into Emp_Coupons values ('Kim',89)
select * from Emp_Coupons

DECLARE Check_Record CURSOR
    FOR 
		if()
			begin
			--lag()
			end

		
		
		select *,
		LAG(Coupon_No,1) over(order by name) as "Previous"
		from Emp_Coupons
----------------------------------------------------
--q5
drop table Company_Data
Create table Company_Data
				(EmpId int,
				 Ename varchar(30),
				 Job varchar(20))

create procedure Add_Company_Data 
					@emp_id int,
					@ename varchar(20),
					@job varchar(20)
as 
	begin
		if(@emp_id not in (select EmpId from Company_Data))
			begin
				insert into Company_Data(EmpId,Ename,Job)
				values (@emp_id,@ename,@job)
			end
		else
			begin
				print 'EmpID already exist'
			end
	end

select * from Company_Data

delete from Company_Data
where EmpId = 1002

exec Add_Company_Data 
			@emp_id = 1001,
			@ename = 'Arpit Pardesi',
			@job = 'Data Analyst'
----------------------------------------------------
--q6
drop procedure IsHighest

create procedure IsHighest (@Ename varchar(20))
as
select top 1 case
		when (select sal from EMP where ENAME = @Ename) >= (select max(sal) from EMP) then @Ename+' is the highest earner'
		when (select sal from EMP where ENAME = @Ename) < (select max(sal) from EMP) then @Ename+' is not the highest earner'
	end as "Is Highest"		
from EMP
go

exec IsHighest 'King'
---------------------------
--q7

create function Yearly_Raise(@E_sal int, @E_deptno int, @E_job varchar(20))
returns int
as 
	begin
		declare @Raise int
		if(@E_job = 'Clerk' and @E_deptno = 10 and @E_sal > 1000) 
			begin
				set @Raise = 20
			end
		else if(@E_job = 'Clerk' and @E_deptno = 10 and @E_sal < 1000) 
			begin
				set @Raise = 15
			end
		else if(@E_job = 'Clerk' and @E_deptno = 20 and @E_sal > 1000) 
			begin
				set @Raise = 5
			end
		else if(@E_job = 'Clerk' and @E_deptno = 20 and @E_sal < 1000) 
			begin
				set @Raise = 18
			end
		else if(@E_job = 'Clerk' and @E_deptno = 30) 
			begin
				set @Raise = 10
			end
		else 
			begin
				set @Raise = 5
			end
	return @Raise
	end

select dbo.Yearly_Raise(1100,10,'King')

update Emp_Raise_Table
set sal = sal + sal * dbo.Yearly_Raise(sal, deptno, ename)

select * from Emp_Raise_Table
----------------------------


--q8 *************
create view Emp_Dept as 
Select E.EMPNO, E.ENAME, E.SAL, E.JOB, D.DEPTNO, D.DNAME, D.LOC
from EMP E Join Dept D
on E.DEPTNO = D.DEPTNO

select * from Emp_Dept

create trigger DML_On_View
on Emp_Dept
for Insert, Update, delete
AS
	BEGIN
		
	END
------------------------------
--q9

create table Inflation_Data
		(Year int,
		 Inflation_Amount int)
insert into Inflation_Data values(2010, 1900)
select * from Inflation_Data

delete from Inflation_Data

Create trigger Check_Inflation_Data 
on Inflation_Data
for insert
as
	begin
	if(((select Year from Inserted) > (select max(year) from Inflation_Data)) 
	and ((select Inflation_Amount from Inserted) > (select max(Inflation_Amount) from Inflation_Data)))
		begin
			Insert into Inflation_Data
			select * from Inserted
		end
	end

-------------------------
--10
create procedure Show_Max_Salary (@DName varchar(50),@Max_Sal int output)
as 
set @Max_Sal = (select max(e.SAL) 
				from EMP E
				join DEPT D on E.DEPTNO = D.DEPTNO 
				where D.DNAME = @DName)
Select @Max_Sal
go

declare @x int
exec Show_Max_Salary 'Research', @x output


