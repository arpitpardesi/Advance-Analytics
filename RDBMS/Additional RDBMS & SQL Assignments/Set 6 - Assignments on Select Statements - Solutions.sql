--q1
select * from Salesman
having name like 'N___I%'

--q2

select * from testtable
where col1 like '%_%'

--q3
select *
from customer
where grade = (select min(grade)
			   from customer)

--q4
select max(purch_amt)
from Orders
where ord_date = '2012-08-17' 

--q5
select customer_id, ord_date, purch_amt
from Orders
where purch_amt = (select max(purch_amt)
				   from Orders
				   where purch_amt between 2000 and 6000)

--q6
select count(salesman_id)
from salesman
where city is not Null

--q7
select o.* 
from Orders O Join Salesman S
on O.Salesman_id = S.Salesman_id
where S.name = 'Paul Adam'

--q8
select O.*
from Orders O Join Salesman S
on O.Salesman_id = S.Salesman_id
where O.purch_amt > (select avg(purch_amt)
					 from orders
					 where ord_date = '2012-10-10')

--q9 *****
with SecondLowest 
as(
select E.EMP_FNAME,E.EMP_LNAME, ED. DPT_ALLOTMENT, ED.DPT_CODE, dense_rank() over(Partition by ED.DPT_CODE order by  ED.DPT_ALLOTMENT) as "EMP_RANK"
from emp_details E Join emp_department ED
on E.EMP_DEPT = ED.DPT_CODE
)
select * from DeptWise_Rank
where EMP_RANK = 2

--q10 ***
select name from Salesman
where city = 'London'
union
select cust_name from Customer
where city = 'London'

--q11
select cust_name, city, grade, 'High Rating'
from customer
where grade > 200
union
select cust_name, city, grade, 'Low Rating'
from customer
where grade < 200

--q12
create view GradeLevel as
select grade, count(grades)
from Customer 
group by grades

--q13

select Distinct count(ord_no), count(salseman_id), avg(purch_amt), sum(purch_amt)
from emp

--q14
create view Sale_Cust as 
select O.ord_no, S.name, C.cust_name 
from orders O inner join salsman S
on o.saleman_id = S.saleman_id
inner join customer C  
on O.customer_id = C.customer_id  

--q15
create view MaxSale
as
select S.name
from orders O join salesman S
on s.customer_id = o.customer_id
where O.purch_amt = (select max(purch_amt) 
					 from orders)

--q16
create view MaxGrade
as
select *
from customer
where grade = (select max(grade)
				from customer)

--q17
select 'For '+cast(ord_date as varchar)+' there are '+cast(count(ord_no) as varchar)+' orders'
from orders
group by ord_date

--q18
select *
from orders
where (date <> '2012-09-10' 
  and salesman_id = 5005)
   or purch_amt < 1000

--q19
select ord_no, purch_amt,cast((purch_amt/60) as varchar)+'%'  as "Achieved", cast((100-(purch_amt/60)) as varchar)+'%'as "Unachieved"
from orders
where purch_amt > purch_amt/0.5


--q20
select s.comm
from Salesman S Join Customer C
on S.salesman_id  = C.salesman_id   
where C.city = 'Paris'

--21

--21.1

--21.2 

select * from countries --country name
select * from regions --region name
--select * from departments --department id, department name
--select * from employees ---Employeeid, employee name, the Employee’s salary
--select * from jobs  --job title, Difference in the maximum salary
--select * from job_history --Start date of job, end date of job

--21.2.1  SQL 89
select E.employee_id, E.first_name+' '+E.last_name AS "Name", D.department_id,D.department_name 
from employees E, departments D
where E.deparment_id = D.department_id

--21.2.2  SQL 92
select distinct E.employee_id, E.first_name+' '+E.last_name AS "Name" , D.department_id,D.department_name,
	   JH.start_date, JH.end_date, J.job_title
from employees E 
join departments D on E.deparment_id = D.department_id
join job_history JH on JH.employee_id = E.employee_id
join jobs J on J.job_id = E.job_id


cross join (select * 
from countries C
join regions R on c.regiod_id=r.region_id ) CR



(MAX(E.SALARY) - E.salary) as "Difference", E.salary
GROUP BY E.employee_id,e.first_name,e.last_name, D.department_id, D.department_name, 
		 JH.start_date, JH.end_date, J.job_title, E.salary

SELECT MAX(SALARY) FROM employees


select * 
from countries C
join regions R on c.regiod_id=r.region_id 