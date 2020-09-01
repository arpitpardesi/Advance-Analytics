CREATE TABLE TAB1(A INTEGER);
CREATE TABLE TAB2(B INTEGER);
CREATE TABLE TAB3(C INTEGER);
DROP TABLE tab3
-----------------------------------
CREATE TRIGGER TRIG1
ON TAB1
FOR INSERT
AS
BEGIN
	INSERT INTO TAB2
	SELECT * FROM INSERTED
END
-------------------------
select * from tab1
select * from tab2

insert into tab1 values(100)
----------------------------------
CREATE TRIGGER TRIG2
ON TAB1
FOR DELETE
AS
BEGIN
	INSERT INTO TAB3
	SELECT * FROM DELETED
END

DELETE FROM TAB1

-------------------------
select * from tab1
select * from tab3
-------------------------
CREATE TABLE TAB4(D INTEGER);

DROP TRIGGER TRIG4

CREATE TRIGGER TRIG3
ON TAB4
FOR INSERT
AS
BEGIN
	IF (SELECT D FROM INSERTED)<100
		BEGIN
			PRINT'VALUE CANNOT BE LESS THEAN 100'
			rollback tran
		END
END

insert into tab4 values(90)
select * from tab4
--------------------------------

Create table s(roll integer, name varchar(40));
Insert into s values(1,'A');
Insert into s values(2,'B');
Insert into s values(3,'C');
Insert into s values(4,'D');

create table r(roll integer,marks integer);
 Insert into r values(2,90);
 Insert into r values(3,98);

--------------------------------------
select * from s;
select * from r

create view sr
as
select s.roll,s.name,r.marks
from s,r
where s.roll = r.roll;

insert into sr values(5,'z',80);

create trigger trig12 
on SR
INSTEAD OF INSERT --fOR INSERTING VALUES THROUGH VIEW
as
begin
   insert into s
   select roll,name
   from Inserted
   insert into r
   select roll,marks
   from inserted
end

