--t1
create table SCHEDULER_LOGIN 
		(Scheduler_Name	Varchar(30),
		 Password	Varchar(30))


--t2
create table EMPLOYEE 
		(Employee_ID	Int Primary Key,
		 Employee_Name 	Varchar(30),
		 DOB 	Date,
		 DOJ 	Date,
		 Qualification 	Varchar(50),
		 Experience	Number(2),
		 Skill_ID	Varchar(100),
		 Technology	Varchar(100),
		 Grade 	Varchar(5),
		 Designation 	Varchar(50),
		 Resource_Status 	Varchar(20),
		 Project_ID	Number(9))

--t3

create table PROJECT_MASTER
			(Project_ID	Number(9)
			 Project_Name 	Varchar(100)
			 BHU (Business Handling Unit) 	Varchar(20)
			 Location 	Varchar(20)
			 DUL (DU Lead) (Hint :this is the employee ID)	Number(9)
			 Start_Date	Date
			 Expected_End_Date 	Date)
--t4
create table PROJECT_DETAILS 
			(Project_ID	Number(9),
			 Skill_Id	Number(3),
			 Technology	Varchar(20),
			 Start_Date 	Date,
			 Expected_End_Date 	Date,
			 Number_Of_Resources	Number(1),
			 Skill_Status	Varchar(1))
--t5
create table PROJECT_SCHEDULE_MASTER 
			(Schedule_ID	Number,
			 Project_ID	Number(3), 
			 Project_Name	Varchar(100),
			 Start_Date	Date,
			 Expected_End_Date	Date,
			 Requirement Requestor**(RR_Name)	Varchar(20),
			 RR_EnterpriseId	Varchar(20),
			 RR_PhoneNo	Varchar(15))

--t6
Create Table PROJECT_SCHEDULE_DETAILS 
			(Schedule_ID	Number,
			Skill_ID	Number,
			Number_Of_Resources	Number,
			Employee_ID	Number,
			Employee_Name	Varchar(20),
			Designation 	Varchar(50),
			Start_Date	Date,
			Expected_End_Date	Date,
			Resource_Status	Varchar)

--t7
create  table SKILL
			(Skill_Id	Number(3),
			Technology	Varchar(100))

--t8
create table GRADE
			(Grade_ID	Number(3),
			Grade	Number(3),
			Designation	Varchar(30))