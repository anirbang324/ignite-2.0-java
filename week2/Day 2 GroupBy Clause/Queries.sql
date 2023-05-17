1. Write a query to display the batch name and the number of profiles under each batch who have registered in the system, sorted by batch name. Give an alias to the number of profiles from each batch as profile_count.

select p1.batch , count(u1.profile_id) as profile_count
from profile p1 , user u1 
where u1.profile_id= 1 group by p1.batch;


2.Write a query to display the batch name and the number of male alumni from each batch who have registered in the system,sorted by batch name. Give an alias to the number of male alumni from each batch as male_alumni_count.

select batch, count(gender) as male_alumni_count 
from profile where gender= 'male' group by batch;


3. Write a query to display the batch name and the number of female alumni from each batch who have registered in the system, sorted by batch name. Give an alias to the number of female alumni from each batch as female_alumni_count.

select batch, count(gender) as female_alumni_count
from profile where gender= 'female' group by batch;


4. Write a query to display the designation and the number of users who are currently working in each designation, sorted by designation. Give an alias as designation_count.

select designation , count(*) as designation_count from profile   group by designation; 


5. Write a query to display the year and the number of events scheduled in each year, sorted by year. Give an alias as number_of_events.

select year(date) , count(*) as number_of_events from event
group by year(date) order by date;


6.Write a query to display the month and the minimum units of electricity consumed in each month. Give an alias name to the minimum units as 'minimum_units'.

select month, min(total_units) as minimum_units from  bill
group by month;