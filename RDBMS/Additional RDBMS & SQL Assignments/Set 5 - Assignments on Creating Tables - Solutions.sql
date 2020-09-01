select dbo.Date_Check('2020-07-06', '2020-07-15')
/*
create function Date_Check(@Start date, @end date)
returns int
as 
	begin
		declare @dif int
		set @dif = DateDiff(day, @Start, @end)
	return @dif
	end
*/

--q1
create table Customer_Details
			   (Customer_Id int identity(501,1) check(Customer_Id between 0 and 9999),
				C_FirstName varchar(20) Check(C_FirstName NOT LIKE '%[^a-zA-Z]%'),
				C_LastName varchar(20) Check(C_LastName NOT LIKE '%[^a-zA-Z]%'),
				C_Temperature decimal(5,2),
				Date_of_Enrollment date Not Null check(Date_of_Enrollment between '2019-04-01' and '2019-09-30'),
				MailId varchar(50) unique not null,
				Customer_Registration_No varchar(8) check(Customer_Registration_No like 'ZEN____K'),
				Customer_Token_Number varchar(10) null check(Customer_Token_Number is Null),
				Customer_Ref_Number varchar(10) check(Customer_Ref_Number = upper(Customer_Ref_Number)),
				Date_of_Processing date,
				Processing_Cost int check(Processing_Cost>500),
				Service_Charge numeric ,
				check(dbo.Date_Check(Date_of_Enrollment, Date_of_Processing) between 1 and 10),
				check(Service_Charge <= Processing_Cost*.12))

select  * from Customer_Details
delete from Customer_Details where Customer_Id = 504
dbcc checkident (Customer_Details, reseed, 500)
insert into Customer_Details values('Arpit','Pardesi',36.4,'2019-07-06','arpit.pardesi6@zensar.com','ZEN9128K',null,'ABC123','2019-07-15',550,50)
-----q2
--t1
create table Enquiry_Master
			(Enquiry_ID varchar(10) Primary Key not null ,
			 Enquiry_Name varchar(50),
			 Enquiry_Mobile_Number varchar(15) not null,
			 Enquiry_Date date not null,
			 SalesmanID varchar(10) not null)

Insert into Enquiry_Master values (1,'',9876543210,'2020-08-30',1001)

select * from Enquiry_Master
--t2
create table Enrollment_Master
			(Enrollment_ID varchar(10) primary key REFERENCES Enquiry_Master(Enquiry_ID) ON UPDATE CASCADE,
			 Enrollment_Name varchar(50) not null, 
			 Enrollment_Mobile_Number numeric not null,
			 Enrollment_Date date not null,
			 Fees numeric not null default(10000))
Insert into Enrollment_Master values(2,'Arpit',9876543210,'2020-08-30',12000)
select * from Enrollment_Master
--t3
create table Training_Batch
			(Student_ID varchar(10) Primary Key REFERENCES Enrollment_Master(Enrollment_ID) ON UPDATE CASCADE,
			 Batch_ID varchar(20) not null,
			 Batch_Type varchar(20) check(Batch_Type='Online' or Batch_Type = 'Physical Classroom'),
			 Trainer_ID varchar(20) not null)
SELECT * FROM Training_Batch

Insert into Training_Batch values ('1','B001','Online','T001')
--t4
create table Post_Training_Project
			(Student_ID varchar(10) Primary Key REFERENCES Training_Batch(Student_ID) ON UPDATE CASCADE,
			 Project_ID varchar(10),
			 Project_Start_Date date,
			 Project_End_Date date)
select * from Post_Training_Project
--t5
create table Certificate_Details
			(Student_ID varchar(10) REFERENCES Post_Training_Project(Student_ID) ON UPDATE CASCADE, --to be taken from Student_ID of the table Post_Training_Project
			 Certificate_ID varchar(10) Not NUll,
			 Date_Of_Issue date Not Null)

select * from Certificate_Details




drop table Enquiry_Master
drop table Enrollment_Master
drop table Training_Batch
drop table Post_Training_Project
drop table Certificate_Details
