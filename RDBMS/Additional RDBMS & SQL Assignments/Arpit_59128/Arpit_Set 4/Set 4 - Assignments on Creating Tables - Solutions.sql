--t1
create table SCHEDULER_LOGIN 
		(Scheduler_Name	Varchar(30) check(Scheduler_Name NOT LIKE '%[^a-zA-Z]%'),
		 Password	Varchar(30))

--t2
create table EMPLOYEE 
		(Employee_ID	numeric(9) Primary Key,
		 Employee_Name 	Varchar(30),
		 DOB 	Date,
		 DOJ 	Date,
		 Qualification 	Varchar(50),
		 Experience	numeric(4,2),
		 Skill_Id	numeric(3),
		 Technology	Varchar(100),
		 Grade_Id 	numeric(3),
		 Designation 	Varchar(50),
		 Resource_Status Varchar(20),
		 Project_ID	numeric(9))
--t3

create table PROJECT_MASTER
			(Project_ID	numeric(9) Primary Key,
			 Project_Name 	Varchar(100),
			 BHU Varchar(20),
			 Location 	Varchar(20),
			 DUL numeric(9) references EMPLOYEE(Employee_ID),
			 Start_Date	Date,
			 Expected_End_Date Date)

--t4
create table PROJECT_DETAILS 
			(Project_ID	numeric(9) references PROJECT_MASTER(Project_ID),
			 Skill_Id	numeric(3),
			 Technology	Varchar(20),
			 Start_Date 	Date,
			 Expected_End_Date 	Date,
			 Number_Of_Resources varchar(1),
			 Skill_Status	Varchar(1))
--t5
create table PROJECT_SCHEDULE_MASTER 
			(Schedule_ID	numeric Primary Key,
			 Project_ID	numeric(9) references PROJECT_MASTER(Project_ID), 
			 Project_Name	Varchar(100),
			 Start_Date	Date,
			 Expected_End_Date	Date,
			 RR_Name	Varchar(20),
			 RR_EnterpriseId	Varchar(20),
			 RR_PhoneNo	Varchar(15))

--t6
Create Table PROJECT_SCHEDULE_DETAILS 
			(Schedule_ID numeric references PROJECT_SCHEDULE_MASTER(Schedule_ID),
			Skill_ID numeric(3),
			Number_Of_Resources	numeric,
			Employee_ID	numeric(9) references EMPLOYEE(Employee_ID),
			Employee_Name	Varchar(20),
			Designation 	Varchar(50),
			Start_Date	Date,
			Expected_End_Date	Date,
			Resource_Status	Varchar)

--t7
create  table SKILL
			(Skill_Id	numeric(3) Primary Key,
			Technology	Varchar(100))

--t8
create table GRADE
			(Grade_ID	numeric(3) Primary Key,
			Grade	numeric(3),
			Designation	Varchar(30))


drop table SCHEDULER_LOGIN
drop table EMPLOYEE
drop table PROJECT_MASTER
drop table PROJECT_DETAILS
drop table PROJECT_SCHEDULE_MASTER
drop table PROJECT_SCHEDULE_DETAILS
drop table SKILL
drop table GRADE
