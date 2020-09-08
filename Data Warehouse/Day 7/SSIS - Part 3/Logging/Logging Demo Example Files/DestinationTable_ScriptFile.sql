use master 
go
create database demo0
go
use demo0
go
create table transactions(trid varchar(5), Amount int)
go
/*Create and run the ETL SSIS Package to load records from 
text file into transactions table!!
*/
select * from transactions
go

-----------------------------------