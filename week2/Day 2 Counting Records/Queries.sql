1. Write a query to display the number of roles in the role table. Give an alias to the number of roles as role_count.

select count(*) as role_count from role; 


2. Write a query to display the number of skills in the skill table. Give an alias to the number of skills as skill_count.

select count(*) as skill_count from skill;


3. Write a query to display the number of users who have not filled their profile yet. Give an alias to the number of users as user_count.

select count(*)  as user_count from user where profile_id is null;


4. Write a query to display the number of alumni from 2008 batch who have registered in the system. Give an alias as alumni_2008_count.

select count(*) as alumni_2008_count from profile where batch= '2008';


5. Write a query to display the number of male alumni from 2008 batch who have registered in the system. Give an alias as alumni_male_2008_count.

select count(*) as alumni_male_2008_count from profile
where batch= '2008' and gender= 'male';


6. Write a query to display the number of users who are currently working as 'Project Manager's. Give an alias as PM_Count.

SELECT COUNT(*) AS PM_Count
FROM profile
WHERE designation = 'Project Manager';


7. Write a query to display the batch of the seniormost alumni woking as 'Project Manager'. Give an alias as Senior_PM_Batch.

SELECT min(batch) AS Senior_PM_Batch
FROM profile
WHERE designation = 'Project Manager'  order by batch;


8. Write a query to display the batch of the juniormost alumni woking as 'Project Manager'. Give an alias as Junior_PM_Batch.

SELECT max(batch) AS Junior_PM_Batch
FROM profile
WHERE designation = 'Project Manager'  order by batch;


9. Write a query to display the number of projects in which the team size is more than 10. Give an alias as project_count.

select count(*) as project_count from project where number_of_members >10;


10. Write a query to display the number of queries raised / answered between 1 a.m and 5 a.m (both inclusive). Give an alias as number_of_queries.

SELECT COUNT(*) AS number_of_queries 
FROM query 
WHERE EXTRACT(hour FROM date) BETWEEN 1 AND 5;


11. Write a query to display the number of posts posted before 1st December, 2013. Give an alias as number_of_posts.

select count(*) as number_of_posts from post where date <  '2013-12-01';


12. Write a query to display the number of posts posted after 1st December, 2013. Give an alias as number_of_posts.

select count(*) as number_of_posts from post where date >  '2013-12-01';


13. Write a query to display the number of buildings having an email_address.Give an alias name as 'count_of_buildings_with_email'.

select count(*) as count_of_buildings_with_email
from building where email_address is not null; 

14. Write a query to display the number of bills having fine amount.Give an alias name as 'count_of_bills_with_fine'.

select count(*) as count_of_bills_with_fine from bill 
where fine_amount is not null;


15. Write a query to display the number of bills in which the bill payment is completed.Give an alias name as 'count_of_bills_with_payment'.

select count(*) as count_of_bills_with_payment from bill where is_payed !=0;


16. Write a query to display the number of electricity reading in which the total units per day is greater than 500.Give an alias name as 'count_total_units_500'.

select count(*) as count_total_units_500 from electricity_reading
where total_units >500;
