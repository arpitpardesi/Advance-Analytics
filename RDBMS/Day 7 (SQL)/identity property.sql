-- Identity Property
create table tab1 
	(rec_no int identity,
	 sname varchar(10))

insert into tab1 values('D')
dbcc checkident (rec_no, reseed, 10)


select * from tab1
-----------------------------------------
create table tab2
	(rec_no int identity(101,2),
	 sname varchar(10))

insert into tab2 values('A')
insert into tab2 values('B')

select * from tab2
-----------------------------------------

select * from tab1

set identity_insert tab1 on
insert into tab1 (rec_no,sname) 
values(9,'E')

set identity_insert tab1 off
insert into tab1 
values('F')

delete from tab1 where rec_no = 16

TRUNCATE TABLE tab1('sname') values ('G')

sp_help tab1