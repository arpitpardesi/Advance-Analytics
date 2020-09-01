--Q1
CREATE VIEW Salesman_data AS 
SELECT * FROM EMP
WHERE JOB = 'Salesman'
WITH CHECK OPTION

select * from Salesman_data
INSERT INTO Salesman_data VALUES(74,'MARTIN','ceo',7698,'1981-09-28 00:00:00.000',1250,1400,30)

--Q2
CREATE VIEW Emp_Salary_Details AS
SELECT ENAME, SAL, COMM, SAL+ISNULL(COMM,0) AS 'Total',SAL*0.01 AS 'HRA', 
(SAL+ISNULL(COMM,0))*.3 AS 'Tax', SAL*0.05 'DA',SAL*0.07 'TA',
200 AS 'PF', ((SAL+ISNULL(COMM,0))-((SAL+ISNULL(COMM,0))*.3))+((SAL*0.01)+(SAL*0.05)+(SAL*0.07)) as 'Gross'
FROM EMP

SELECT * FROM Emp_Salary_Details

DELETE FROM EMP WHERE ENAME = 'ONE'
--Q3
CREATE VIEW Direct_Reporting AS
SELECT * FROM EMP
WHERE MGR = (SELECT EMPNO FROM EMP WHERE ENAME = 'KING')

SELECT * FROM Direct_Reporting