select distinct DEPTNO
from EMP

select DEPTNO, sum(sal) as Total
from EMP
group by DEPTNO

select DEPTNO, sum(sal) as Total
from EMP

select continent, country, Sum(sales)
from products2
group by country

select EMPNO, max(SAL) as Highest
from EMP
group by EMPNO

select DEPTNO, max(SAL) as Highest
from EMP
group by DEPTNO
HAVING sum(sal) > 10000

SELECT YEAR(HIREDATE), SUM(SAL) AS TOTAL
FROM EMP
GROUP BY YEAR(HIREDATE)
HAVING YEAR(HIREDATE) > 1981

/*Display job wise total salaries excluding president. Display on those jobs and totals
where total is > 2800
*/
Select Job, Max(Sal) as Highest
from emp
--where job <> 'President'
group by job
having max(sal) > 2800 AND job <> 'President'
order by 2 asc