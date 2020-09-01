Use Master
go
Create Database Electronics
go
Use Electronics
go

create table Suppliers
(Supplier_ID char(2) Primary Key,
 Supplier_Name varchar(20),
 Supplier_Comm Integer);

create table Item_Master
(Item_Id varchar(10) Primary Key,
  Item_Name varchar(40),
  Item_Cost Integer,
  Supplier_Id char(2) References Suppliers);

create table Stock_Items
(Item_Id varchar(10) References Item_Master,
 Quantity_In_Hand Integer,
 Reorder_level Integer);

create table Sales_Persons
(Salesman_Id varchar(5) primary key,
 Salesman_Name varchar(20),
 Salesman_Comm Integer);
 
create table Area
(Area_Id varchar(3) Primary Key,
 Area_Name varchar(20)
);

create table Transactions
(Tr_Id BigInt,
 Item_Id varchar(10) References Item_Master,
 Salesman_Id varchar(5) References Sales_Persons,
Area_Id varchar(3) References Area,
Qty_Sold Integer);

Create Sequence Tr_Seq Start with 1 Increment By 1;

Insert Into Suppliers Values('S1','Sunil', 80);
Insert Into Suppliers Values('S2','Anil', 70);
Insert Into Suppliers Values('S3','Kapil', 30);
Insert Into Suppliers Values('S4', 'Sanjay', 100);

Insert Into Item_Master Values('I1', 'ONIDA TV', 14000, 'S1');
Insert Into Item_Master Values('I2', 'SONY TV', 25000, 'S2');
Insert Into Item_Master Values('I3', 'SONY RADIO', 1500, 'S4');
Insert Into Item_Master Values('I4', 'National 2_in_one', 2300, 'S1');
Insert Into Item_Master Values('I5','ONIDA LCD', 34000, 'S3');
Insert Into Item_Master Values('I6', 'SONY Walkman', 7000,'S1');
Insert Into Item_Master Values('I7', 'National Walkman', 6000,'S2');
Insert Into Item_Master Values('I8', 'LG LCD', 28000, 'S3');
Insert Into Item_Master Values('I9', 'Philips LCD', 28000, 'S3');
Insert Into Item_Master Values('I10', 'LG TV', 16000, 'S2');

Insert Into Stock_Items Values('I1', 10, 7);
Insert Into Stock_Items Values('I2',  23, 15);
Insert Into Stock_Items Values('I3', 7, 2);
Insert Into Stock_Items Values('I4', 40, 30);
Insert Into Stock_Items Values('I5', 15, 11);
Insert Into Stock_Items Values('I6', 20, 10);
Insert Into Stock_Items Values('I7', 60, 30);
Insert Into Stock_Items Values('I8', 25, 15);
Insert Into Stock_Items Values('I9', 30, 25);
Insert Into Stock_Items Values('I10', 100, 20);

Insert Into Sales_Persons Values('SLM1','Deepak', 500);
Insert Into Sales_Persons Values('SLM2','Pushkar', 250);
Insert Into Sales_Persons Values('SLM3','Jaywant', 300);
Insert Into Sales_Persons Values('SLM4','Vikas', 300);
Insert Into Sales_Persons Values('SLM5', 'Prashant', 400);
Insert Into Sales_Persons Values('SLM6', 'Parag', 750);

Insert Into Area Values('A1', 'Kothrud');
Insert Into Area Values('A2','Aundh');
Insert Into Area Values('A3','Camp');
Insert Into Area Values('A4','Deccan');

 Insert Into Transactions (Item_Id, SALESMAN_ID,Area_Id    )
select Item_Id, SALESMAN_ID,area_id
from Item_Master CROSS JOIN Sales_Persons cross join area;

Update Transactions
Set tr_id = Next Value For Tr_Seq

Update Transactions
Set Qty_Sold = 1
where tr_id in (1,7,9,11, 25, 29, 37, 39, 41, 44, 48, 52, 56, 58, 61, 66, 68, 69, 74, 78, 88, 102,109, 119, 134, 139, 147, 149, 154, 159, 160, 162, 173, 175, 188, 193, 200, 203, 213, 226, 228, 231, 235, 240);

Update Transactions
Set Qty_Sold = 2
where tr_id in (2,3,8,12,14,19,22,27,31,33,35,40,46,50,53,63,71,72,75,80,81,85,90,93,97,100,104,111,113,122,124,126,140,142,152,175,181,187,195,212,216,219,221,223,225,232,233,237,239);

Update Transactions
Set Qty_Sold = 3
where Qty_Sold Is Null;






