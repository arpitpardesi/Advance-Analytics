--	Q1
drop table student_details
create table student_details 
	(RolNo int not null	primary key,
	 Name varchar(100) Not Null,
	 City varchar(30) default 'Pune',
	 Marks int check(Marks>=0 and Marks <=100),
	 Invoice_No Char(10) Unique
	)
	go
	select * from student_details
	insert into student_details values(1,'Arpit','Mhow',90,'A001')
	insert into student_details values(2,'Anushka','Indore',90,'A002')
	insert into student_details values(3,'Akansha','Mhow',140,'A003')
--	Q2
select * from certificate_details
create table certificate_details
	(RollNo int,
	 Date_Of_Certificate date Not Null,
	 Course Varchar(20) check(Course = 'SQl' or Course = 'BI' or Course = 'Cloud Computing'),	
	 FOREIGN KEY (RollNo)
        REFERENCES student_details (RolNo)
        ON DELETE CASCADE
	)

insert into certificate_details values (1,'1998-05-06', 'BI')

DELETE FROM student_details 
WHERE RolNo = 1;


--	Q3

create table result_sheet
	(RollNo int,
	 Name varchar(100),
	 Marks int Not Null,
	 primary key(RollNO, Name))

insert into result_sheet values (1,'Arpit Pardesi', 100)
insert into result_sheet values (2,'Akansha Pardesi', 99)
DELETE FROM result_sheet 
WHERE RollNo = 2;

select * from result_sheet
--	Q4
create table gradation
	(RollNo int,
	 Name VARCHAR(100),
	 Grade varchar(5) check(Grade = 'A' or Grade = 'B'),
	 FOREIGN KEY (RollNo, Name) REFERENCES result_sheet (RollNo, Name))
insert into gradation values (1,'Arpit Pardesi', 'A')
insert into gradation values (2,'Akansha Pardesi', 'B')

select * from gradation

--	Q5

CREATE TABLE cost_analysis
	(Company_ID int primary key,
	 Company_Name varchar(50) Not null,
	 Export_Cost int,
	 Import_Cost int,
	 CONSTRAINT CHK_COST CHECK (Import_Cost>=Export_Cost*0.4))

INSERT INTO cost_analysis VALUES(100,'ABC',100,100)

SELECT * FROM cost_analysis
drop table cost_analysis