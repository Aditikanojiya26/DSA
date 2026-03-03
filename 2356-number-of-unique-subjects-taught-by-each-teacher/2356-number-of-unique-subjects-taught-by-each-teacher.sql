# Write your MySQL query statement below
Select teacher_id , count(distinct(subject_id)) as cnt FROM Teacher group by teacher_id;