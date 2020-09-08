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
SELECT emp_fname, emp_lname 
FROM emp_details 
WHERE emp_dept IN (SELECT dpt_code
                   FROM emp_department 
                   WHERE dpt_allotment = (select top 1 dpt_allotment from emp
										  where dpt_allotment in (select top 2 dpt_allotment 
																  from emp_department
																  order by dpt_allotment)
                                          order by dpt_allotment desc


--q10 ***

select S.name, C.Cust_name
from Salesman S
Join Customer C on S.salesman_id = C.salesman_id
Where 

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
create view Track as
select Distinct count(ord_no), count(salseman_id), avg(purch_amt), sum(purch_amt)
from orders

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

--select * from countries --country name
--select * from regions --region name
--select * from departments --department id, department name
--select * from employees ---Employeeid, employee name, the Employee’s salary
--select * from jobs  --job title, Difference in the maximum salary
--select * from job_history --Start date of job, end date of job
select * from locations
--21.2.1  SQL 89
Select E.employee_id, (E.first_name+e.last_name) as "Name", D.department_id, D.department_name,
	   JH.start_date, JH.end_date, J.job_title, C.country_name, R.region_name, 
	   (max(J.max_salary) over()) - E.salary as "Difference"
from employees E, departments D, job_history JH, jobs J, locations L, countries C, regions R
where E.deparment_id = D.department_id
  and D.department_id = JH.department_id
  and JH.job_id = J.job_id
  and D.location_id = L.location_id
  and L.country_id = C.country_id
  and C.region_id = R.region_id
	

--21.2.2  SQL 92

Select E.employee_id, (E.first_name+e.last_name) as "Name", D.department_id, D.department_name,
	   JH.start_date, JH.end_date,J.job_title, C.country_name, R.region_name, 
	   (max(J.max_salary) over()) - E.salary as "Difference"
from employees E
join departments D on D.department_id = E.deparment_id
join job_history JH on D.department_id = JH.department_id
join jobs J on JH.job_id = J.job_id
join locations L on D.location_id = L.location_id
join countries C on L.country_id = C.country_id
join regions R on C.region_id = R.region_id