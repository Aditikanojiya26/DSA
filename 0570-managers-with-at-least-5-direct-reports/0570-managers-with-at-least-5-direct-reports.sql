# Write your MySQL query statement below
Select e2.name from 
Employee e1 JOIN 
Employee e2 ON
e1.managerId = e2.id
GROUP BY e2.id,e2.name HAVING count(*)>=5