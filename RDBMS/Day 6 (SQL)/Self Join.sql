-- Self Join
SELECT * FROM EMP

select e.ENAME as "Employee", m.ENAME as "Manager"
from EMP E Join EMP M
--on E.MGR = M.EMPNO
--ON E.EMPNO = M.EMPNO
ON E.EMPNO = M.MGR