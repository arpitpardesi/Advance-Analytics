--q1
Declare @w integer, @s varchar(Max)
set @w = 31
while @w <= 98
begin
	if @s != '' 
		set @s = @s+cast(@w * 7 as varchar)+'-'
    else
		set @s =cast(@w * 7 as varchar)+'-'
	set @w = @w + 1;
end
print @s
----------------------------
--q2

DECLARE @sal1 int, @sal2 int, @c int
set @c = 0
Declare SalCheck Cursor
for select SAL, lag(SAL,1) over(order by empno) as "Previous"
	from EMP
    where job = 'clerk'
	
open SalCheck

fetch next from SalCheck
into @sal1, @sal2

while @@FETCH_STATUS = 0
Begin
	set @c = @c + 1
	if(@c = 3)
		if(@sal1 > @sal2)
			print 'Third has more salary than the second' 
				else
					print 'Second has more salary than the third'
			
	fetch next from SalCheck
	into @sal1, @sal2

end	
CLOSE SalCheck;    
DEALLOCATE SalCheck;  


--q3

DECLARE @emp_name varchar(20) ,@emp_sal int, @Total int 
set @Total = 0

DECLARE Sal_Raise CURSOR FOR     
SELECT ENAME,SAL FROM Emp
order by SAL;    
  
OPEN Sal_Raise    
  
FETCH NEXT FROM Sal_Raise     
INTO @emp_name,@emp_sal    
  
print 'Employee_ID  Employee_Sal Salary_Rise'       
  
WHILE @@FETCH_STATUS = 0    
BEGIN    

	set @Total = @Total + @emp_sal 
    if @Total < 45000
		print '   ' + CAST(@emp_name as varchar(20)) +'           '+  
        cast(@emp_sal as varchar(20))  + '      '+cast((@emp_sal+@emp_sal*0.01) as varchar(20))      
    FETCH NEXT FROM Sal_Raise     
INTO @emp_name,@emp_sal    
   
END     
CLOSE Sal_Raise;    
DEALLOCATE Sal_Raise;  



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

Declare @name varchar(20), @coupon int, @preCou int
set @preCou = 0
Declare Coupon_Check Cursor 
for select Name, Coupon_No 
	from Emp_Coupons
	
open Coupon_Check

fetch next from Coupon_Check
into @name, @coupon

while @@FETCH_STATUS = 0
Begin
	
	if(@preCou = 0)
		set @preCou = @coupon 
	else if(@coupon > @preCou)
		print @name
	fetch next from Coupon_Check
	into @name, @coupon

end	
CLOSE Coupon_Check;    
DEALLOCATE Coupon_Check;  

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
			set @Raise = 20
		else if(@E_job = 'Clerk' and @E_deptno = 10 and @E_sal < 1000) 
			set @Raise = 15
		else if(@E_job = 'Clerk' and @E_deptno = 20 and @E_sal > 1000) 
			set @Raise = 5
		else if(@E_job = 'Clerk' and @E_deptno = 20 and @E_sal < 1000) 
			set @Raise = 18
		else if(@E_job = 'Clerk' and @E_deptno = 30) 
			set @Raise = 10
		else 
			set @Raise = 5
	return @Raise
	end

select dbo.Yearly_Raise(1100,10,'King')

update Emp_Raise_Table
set sal = sal + sal * dbo.Yearly_Raise(sal, deptno, ename)

select * from Emp_Raise_Table
----------------------------


--q8 *************
delete from EMP
where ENAME = 'Arpit'

create view Emp_Dept as 
Select E.EMPNO, E.ENAME, E.SAL, E.JOB,E.DEPTNO, D.DNAME, D.LOC
from EMP E Join Dept D
on E.DEPTNO = D.DEPTNO

select * from Emp_Dept

select * from dept

insert into Emp_Dept(EMPNO, ENAME, SAL, JOB, DEPTNO) values(100,'ARPIT', 100, 'Analyst', 20)

update Emp_Dept
set SAL= 3000
where ENAME = 'Arpit'

delete from Emp_Dept
where ENAME = 'Arpit'


drop trigger DML_On_View

create trigger DML_On_View
on Emp_Dept
Instead of insert,delete,update
as
Begin
	declare @v_day varchar(20)
select @v_day= datename(dw,getdate()) 
 if @v_day = 'Sunday' 
   begin
 	print 'No Transactions on Sunday'
 	rollback tran
   end
end


------------------------------
--q9

create table Inflation_Data
		(Year int,
		 Inflation_Amount int)

insert into Inflation_Data values(2012, 2010)

select * from Inflation_Data

delete from Inflation_Data

drop trigger Check_Inflation_Data

Create trigger Check_Inflation_Data 
on Inflation_Data
for insert
as
begin
	Declare @year int, @amo int

	set @year = (select max(Year) from Inflation_Data)
	set @amo = (select max(Inflation_Amount) from Inflation_Data)
	if ((select Year from Inserted) < @year)
		begin
		print 'Year Cannot be less then previous'
		rollback tran
		end
	if((select Inflation_Amount from Inserted) < @amo)	
		begin
		print 'Amount cannot be less then previous'
		rollback tran
		end
end
go

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


