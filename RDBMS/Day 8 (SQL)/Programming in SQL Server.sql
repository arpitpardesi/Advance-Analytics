--Programming in SQL Server

print 'Hello!!!'

-- fro " ' " - ''

declare @x int
set @x = 100
print @x
go
declare @x int, @y int
set @X = 100
set @y =200
print @X+@y;


--------------

declare @x int
select @x =sal
from emp	
where ENAME = 'SMITH'
PRINT @X
---------------
DECLARE @Z INT
SELECT @Z
---------------
declare @x int
select @x =sal
from emp	
where JOB = 'salesman'
PRINT @X
select * from EMP
---------------
declare @x integer
set @x = 100
	if(@x > 100)
	begin
		print'More'
		print 'Linnne1'
	end
	else
		print'Less'
-------
declare @x int, @y int
if @x=@y
	print 'Equal'
else
	print 'not Equal'

Set ansi_nulls off 
declare @x int, @y int
if @x=@y
	print 'Equal'
else
	print 'not Equal'

	Set ansi_nulls on

------
declare @w integer
set @w  =1
while @w <= 40
	begin
		if @w = 5
			break
		else 
			print @w
	
	set @w = @w+1
	end
print'End'
----------------------------------

declare @w integer
set @w  = 1
while @w <= 40
	begin
		if ((@w = 4) or (@w = 10))
			break
		else 
			print @w
	set @w = @w+3
	end
print'End'
-----------------

