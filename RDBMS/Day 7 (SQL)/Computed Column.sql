create table customer
	(custid int,
	 qty int,
	 rate int,
	 total as qty*rate)

sp_help customer

insert into customer 
values(100,5,100)

insert into customer 
values(100,5,100,800)

select * from customer1

create table customer1
	(custid int,
	 qty int,
	 rate int,
	 total as qty*rate
	 )

insert into customer1 
values(100,5,100)

create table customer
	(custid int,
	 qty int,
	 rate int,
	 total as qty*rate
	 )