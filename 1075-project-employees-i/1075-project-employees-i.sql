# Write your MySQL query statement below
SELECT P.project_id , ROUND(AVG(E.experience_years),2 )AS average_years 
FROM Project AS P JOIN Employee AS E ON P.employee_id = E.employee_id group by P.project_id