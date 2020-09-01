SELECT * INTO emp_sp1 FROM EMP
SELECT * INTO emp_sp2 FROM EMP
SELECT * INTO emp_sp3 FROM EMP
SELECT * INTO emp_sp4 FROM EMP
-----------------------------------------
--q1
CREATE PROCEDURE Del_Employees(@p_dept INTEGER)
AS
DELETE FROM emp_sp1
WHERE DEPTNO = @p_dept

EXECUTE Del_Employees 20

SELECT * FROM emp_sp1
---------------------------
--Q2
CREATE PROCEDURE Show_Employees_Dname (@p_deptName VARCHAR(20))
AS
SELECT E.*,D.DNAME FROM EMP E, DEPT D
WHERE E.DEPTNO = D.DEPTNO
AND D.DNAME = @p_deptName

EXECUTE Show_Employees_Dname 'RESEARCH'

--Q3
DROP PROCEDURE Del_By_Check

CREATE PROCEDURE Del_By_Check (@p_ID INTEGER,@p_deptNO INTEGER)
AS
DELETE FROM emp_sp2
WHERE EXISTS (SELECT NULL
			  FROM emp_sp2
			  WHERE DEPTNO = @p_deptNO
			  HAVING COUNT(DEPTNO)>3)
AND EMPNO = @p_ID

SELECT * FROM emp_sp2
ORDER BY DEPTNO

EXECUTE Del_By_Check @p_ID=7782 ,@p_deptNO = 10
--Q4
DROP PROCEDURE Change_Salary

CREATE PROCEDURE Change_Salary(@p_Name VARCHAR(20)) 
AS
SELECT ENAME,SAL+SAL*0.25
FROM emp_sp2
WHERE ENAME = @p_Name and
MONTH(HIREDATE) = '5'

EXECUTE Change_Salary 'WARD'

--Q5
DROP PROCEDURE Add_Record

CREATE PROCEDURE Add_Record(@p_EmpNo int, @p_Ename Varchar(20),@p_DeptNo int,@p_Sal int ) 
AS
INSERT INTO emp_sp4(empno,ename,deptno,Sal) 
SELECT @p_EmpNo,@p_Ename,@p_DeptNo,@p_Sal
WHERE @p_Sal < (SELECT AVG(SAL) 
				FROM emp_sp4
				WHERE DEPTNO = @p_DeptNo)

EXECUTE Add_Record @p_EmpNo = 3, @p_Ename = 'EFGH',@p_DeptNo = 10,@p_Sal = 6000
				
SELECT * FROM emp_sp4
--Q6

CREATE FUNCTION raise_sal(@SAL INTEGER) 
RETURNS INTEGER
BEGIN
	RETURN @SAL+@SAL*0.4
END

SELECT ENAME, SAL, DBO.raise_sal(SAL) AS "RAISED SAL" FROM EMP
--Q7
drop function dbo.get_Grade

CREATE FUNCTION get_Grade(@MARKS int)
RETURNS VARCHAR(20)
BEGIN
DECLARE @GRADES VARCHAR(20)
	IF @MARKS >= 70
	BEGIN
		SET @GRADES = 'Distinction'
	END
	ELSE IF @MARKS in (60, 69)
	BEGIN
		SET @GRADES = 'First Class'
	END
	ELSE IF @MARKS in (50,59)
	BEGIN
		SET @GRADES = 'Second Class'
	END
	ELSE IF @MARKS < 50
	BEGIN
		SET @GRADES = 'Failed'
	END
RETURN @GRADES
END

select dbo.get_Grade(60)

CREATE TABLE STUDENT(ROLLNO INT,
					 NAME VARCHAR(20),
					 MARKS INT,
					 GRADES as DBO.get_Grade(MARKS))

INSERT INTO STUDENT(ROLLNO,NAME, MARKS) VALUES (2,'DEF', 40)

select * from STUDENT

--Q8
CREATE TABLE Keep_Trace_Emp (RECORD_ID INT IDENTITY,
							 USERNAME VARCHAR(20),
							 DATE_OF_DELETION VARCHAR(50),
							 TIME_OF_DELETION VARCHAR(20))

DROP TABLE Keep_Trace_Emp

CREATE TRIGGER EMP_TRIG1
ON EMP_TRIG
FOR DELETE
AS
BEGIN
	INSERT INTO KEEP_TRACE_EMP(USERNAME,
							   DATE_OF_DELETION, 
							   TIME_OF_DELETION)
	SELECT user_name(), GETDATE(),CURRENT_TIMESTAMP FROM DELETED
END
------------------------------------------------------------------------------------